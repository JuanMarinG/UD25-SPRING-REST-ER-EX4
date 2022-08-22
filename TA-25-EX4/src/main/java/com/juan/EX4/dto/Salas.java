package com.juan.EX4.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Salas")
public class Salas {

	// ATRIBUTOS TABLA SALAS
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCodigo;
	private String Nombre;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Pelicula")
	private List<Peliculas> pelicula;

	// CONSTRUCTORES
	
	public Salas() {}
	
	public Salas(int idCodigo, String nombre, List<Peliculas> pelicula) {
		super();
		this.idCodigo = idCodigo;
		Nombre = nombre;
		this.pelicula = pelicula;
	}

	//GETTERS Y SETTERS
	
	public int getIdCodigo() {
		return idCodigo;
	}

	public void setIdCodigo(int idCodigo) {
		this.idCodigo = idCodigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public List<Peliculas> getPelicula() {
		return pelicula;
	}

	public void setPelicula(List<Peliculas> pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Salas [idCodigo=" + idCodigo + ", Nombre=" + Nombre + ", pelicula=" + pelicula + "]";
	}
	
	
	
	
	
	
}
