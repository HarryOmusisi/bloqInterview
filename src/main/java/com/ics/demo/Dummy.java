package com.ics.demo;

import com.ics.demo.models.Actor;
import com.ics.demo.models.Category;
import com.ics.demo.models.Movie;
import com.ics.demo.repositories.ActorRepository;
import com.ics.demo.repositories.CategoryRepository;
import com.ics.demo.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class Dummy implements CommandLineRunner {

    private final MovieRepository movieRepository;
    private final ActorRepository actorRepository;
    private final CategoryRepository categoryRepository;
    private final PersonRepository personRepository;

    public Dummy(MovieRepository movieRepository, ActorRepository actorRepository, CategoryRepository categoryRepository, PersonRepository personRepository) {
        this.movieRepository = movieRepository;
        this.actorRepository = actorRepository;
        this.categoryRepository = categoryRepository;
        this.personRepository= personRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Category category =  categoryRepository.save(new Category("Science Fiction"));
        Category category1 = categoryRepository.save(new Category("Thriller"));
        Set<Category> categories = new HashSet<>();
        categories.add(category);
        categories.add(category1);



        Movie movie = new Movie("Bad Boys for life", "2020");
        Movie movie1 = new Movie("The Exorcist", "2017");
        category.addMovie(movie);
        category.addMovie(movie1);

        movieRepository.save(movie);
        movieRepository.save(movie1);
    }
}
