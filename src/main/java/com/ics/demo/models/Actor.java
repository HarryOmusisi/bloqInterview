package com.ics.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "actors")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    public Movie setMovie(Movie movie) {
        return this.movie;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "movie_id_fk")
    private Movie movie;

    public Actor(String name, Movie movie) {
        this.name = name;
        this.movie = movie;
    }

    private Actor() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public interface Create{}

    public interface Update{}
}
