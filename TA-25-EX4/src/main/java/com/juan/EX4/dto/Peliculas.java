package com.juan.EX4.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Peliculas")
public class Peliculas {

	// ATRIBUTOS TABLA SALAS
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFilm;
	private String Nombre;
	private int CalificacionEdad;
	
	@ManyToOne
	@JoinColumn(name = "idCodigo")
	private Peliculas peliculas;

	// CONSTRUCTORES
	
	public Peliculas() {}
	
	public Peliculas(int idFilm, String nombre, int calificacionEdad, Peliculas peliculas) {
		super();
		this.idFilm = idFilm;
		Nombre = nombre;
		CalificacionEdad = calificacionEdad;
		this.peliculas = peliculas;
	}
	//GETTERS Y SETTERS

	public int getIdFilm() {
		return idFilm;
	}

	public void setIdFilm(int idFilm) {
		this.idFilm = idFilm;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getCalificacionEdad() {
		return CalificacionEdad;
	}

	public void setCalificacionEdad(int calificacionEdad) {
		CalificacionEdad = calificacionEdad;
	}

	public Peliculas getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(Peliculas peliculas) {
		this.peliculas = peliculas;
	}

	@Override
	public String toString() {
		return "Peliculas [idFilm=" + idFilm + ", Nombre=" + Nombre + ", CalificacionEdad=" + CalificacionEdad
				+ ", peliculas=" + peliculas + "]";
	}
	
	
}
