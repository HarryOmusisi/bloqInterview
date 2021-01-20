package com.ics.demo.repositories;

import com.ics.demo.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Movie, Long> {

}
