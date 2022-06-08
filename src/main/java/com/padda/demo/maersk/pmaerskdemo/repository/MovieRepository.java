package com.padda.demo.maersk.pmaerskdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.padda.demo.maersk.pmaerskdemo.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
