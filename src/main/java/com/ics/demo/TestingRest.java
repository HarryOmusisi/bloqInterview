package com.ics.demo;

import com.ics.demo.models.Appointment;
import com.ics.demo.models.Movie;
import com.ics.demo.models.Student;
import com.ics.demo.models.Teacher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.List;
@Component
public class TestingRest implements CommandLineRunner {

    private final FeignRestClient feignRestClient;

    public TestingRest(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {
        Rest Template Way

      RestTemplate restTemplate = new RestTemplate();
//
        ResponseEntity<List<Movie>> response = restTemplate.exchange(
                "http://localhost/blog/addPerson?surname=Trump&firstname=Donald&dob=1972-10-11& email=potus@strathmore.edu&mobile_no=0727374660",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Person>>() {});
        List<Person> person = response.getBody();
        System.out.println(person.toString());
//
        Movie movie = restTemplate.getForObject("http://localhost/blog/updatePerson?id=1&surname=Mucina&firstname=Daniel&dob=1972-10-11& email=dmucina@strathmore.edu&mobile_no=0727374660, Movie.class);

        System.err.println(movie.toString());

        String url = "http://localhost/blog/getPerson?id=1"+person.getName() ;
        Movie movieByName = restTemplate.getForObject(
                url,
                Movie.class);
        System.err.println(movieByName.toString());
//
        /*
        * Feign Client way
        * */
//        Movie newMovie = new Movie("Annabelle", "2019");
//        newMovie = feignRestClient.createMovie(newMovie);
//
//        System.out.println("Created movie:" + newMovie.toString());
//        movies = feignRestClient.getAllMovies();
//        System.err.println(movies.toString());
//
//        newMovie.setName("what it do babyyyy");
//        feignRestClient.updateMovie(newMovie.getId(), newMovie);

        /*
         * Mock- CAT
         * */
        Person person = new Person("3354","Harry","Omusisi","4/4/1997","harry@mail","0712345");
//        newStudent = feignRestClient.registerStudent(newStudent);
//        System.out.println("Created Student:" + newStudent.toString());

//        List<Teacher> teachers = feignRestClient.getAllTeachers();
//        System.out.println(teachers.toString());

//        Student student = feignRestClient.findStudentById((long) 5);
//        System.out.println(student.toString());
////
//        Appointment newAppointment = new Appointment(5,3);
//        newAppointment = feignRestClient.createAppointment(newAppointment);
//        System.out.println("Created Appointment" + newAppointment);

        feignRestClient.confirmAppointment((long)9, (long)5);

    }
}
