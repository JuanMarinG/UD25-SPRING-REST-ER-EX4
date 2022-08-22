package com.juan.EX4.dto;



import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Salas")
public class Salas {

	// ATRIBUTOS TABLA SALAS
	
	@Id
	private int idCodigo;
	private String Nombre;
	
	@ManyToOne
	@JoinColumn(name = "Pelicula")
	private Peliculas pelicula;

	// CONSTRUCTORES
	
	public Salas() {}
	
	public Salas(int idCodigo, String nombre, Peliculas peliculas) {
		super();
		this.idCodigo = idCodigo;
		Nombre = nombre;
		peliculas = pelicula;
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

	@Override
	public String toString() {
		return "Salas [idCodigo=" + idCodigo + ", Nombre=" + Nombre + "]";
	}
	
	
	
	
	
	
}
