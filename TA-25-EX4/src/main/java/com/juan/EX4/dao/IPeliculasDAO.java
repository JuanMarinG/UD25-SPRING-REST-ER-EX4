package com.juan.EX4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juan.EX4.dto.Peliculas;

public interface IPeliculasDAO extends JpaRepository<Peliculas, Integer> {

}
