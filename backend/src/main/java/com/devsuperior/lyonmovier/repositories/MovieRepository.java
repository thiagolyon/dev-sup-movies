package com.devsuperior.lyonmovier.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.lyonmovier.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
