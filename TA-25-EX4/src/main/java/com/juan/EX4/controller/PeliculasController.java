package com.juan.EX4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.EX4.dto.Peliculas;
import com.juan.EX4.service.PeliculasServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculasController {
	
	@Autowired PeliculasServiceImpl peliculasServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Peliculas> listarPeliculas(){
		return peliculasServiceImpl.listarPeliculas();
	}

	@PostMapping("/peliculas")
	public Peliculas guardarPeliculas (Peliculas peliculas) {
		return peliculasServiceImpl.guardarPeliculas(peliculas);
	}
	
	@GetMapping("/peliculas/{id}")
	public Peliculas PeliculasPorId(@PathVariable(name="idFilm")int id) {
		Peliculas peliculasPorId = new Peliculas();
		peliculasPorId = peliculasServiceImpl.PeliculasPorId(id);
		return peliculasPorId;
	}
	
	@PutMapping("/peliculas/{id}")
	public Peliculas actualizarPeliculas(@PathVariable(name="idFilm")int id, @RequestBody Peliculas peliculas){
		Peliculas pelicula_seleccionada = new Peliculas();
		Peliculas pelicula_actualizada = new Peliculas ();
		
		pelicula_seleccionada = peliculasServiceImpl.PeliculasPorId(id);
		pelicula_seleccionada.setIdFilm(peliculas.getIdFilm());
		pelicula_actualizada = peliculasServiceImpl.actualizarPeliculas(pelicula_seleccionada);
		return pelicula_actualizada;
		
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void eliminarPeliculas (int id) {
		peliculasServiceImpl.eliminarPeliculas(id);
	}
}
