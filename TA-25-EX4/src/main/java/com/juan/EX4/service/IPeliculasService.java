package com.juan.EX4.service;

import java.util.List;

import com.juan.EX4.dto.Peliculas;

public interface IPeliculasService {

	//ALL
		public List <Peliculas> listarPeliculas();
		
	//CREATE
		public Peliculas guardarPeliculas(Peliculas peliculas);
		
	//READ
		public Peliculas PeliculasPorId(int id);
		
	//UPDATE
		public Peliculas actualizarPeliculas(Peliculas peliculas);
		
	//DELETE
		public void eliminarPeliculas(int id);
}
