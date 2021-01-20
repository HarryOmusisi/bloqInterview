package com.ics.demo;

import com.ics.demo.models.Appointment;
import com.ics.demo.models.Movie;
import com.ics.demo.models.Student;
import com.ics.demo.models.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="client", url="http://127.0.0.1:1000", configuration = FeignConfiguration.class)
public interface FeignRestClient {

//    @RequestMapping(method = RequestMethod.GET, value = "movies")
//    List<Movie> getAllMovies();
//
//    @RequestMapping(method = RequestMethod.GET, value = "movie/{id}")
//    Movie findById(@PathVariable(name = "id") Long id);
//
//    @RequestMapping(method = RequestMethod.POST, value = "movies")
//    Movie createMovie(@RequestBody Movie movie);
//
//    @RequestMapping(method = RequestMethod.PATCH, value = "movies/{id}")
//    Movie updateMovie(@PathVariable(name = "id") Long id, @RequestBody Movie newMovie);

    /*
    * Mock- CAT
    * */

    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student registerStudent(@RequestBody Student student);

    @RequestMapping(method = RequestMethod.GET, value = "students/{id}")
    Student findStudentById(@PathVariable(name = "id") Long id);

    @RequestMapping(method = RequestMethod.GET, value = "lecturers")
    List<Teacher> getAllTeachers();

    @RequestMapping(method = RequestMethod.POST, value = "appointments")
    Appointment createAppointment(@RequestBody Appointment appointment);

    @RequestMapping(method = RequestMethod.PATCH, value = "appointments/{appointmentId}")
    Appointment confirmAppointment(@PathVariable(name = "appointmentId")Long id, @RequestParam(name = "studentId")Long studentId);
}
