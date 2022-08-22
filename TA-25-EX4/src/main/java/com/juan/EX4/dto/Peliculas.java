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
@Table(name = "Peliculas")
public class Peliculas {

	// ATRIBUTOS TABLA SALAS
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFilm;
	private String Nombre;
	private int CalificacionEdad;
	
	@OneToMany(fetch = FetchType.LAZY,	mappedBy = "idCodigo")
	private List <Salas> salas;

	// CONSTRUCTORES
	
	public Peliculas() {}
	
	public Peliculas(int idFilm, String nombre, int calificacionEdad, List<Peliculas> peliculas) {
		super();
		this.idFilm = idFilm;
		Nombre = nombre;
		CalificacionEdad = calificacionEdad;
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

	@Override
	public String toString() {
		return "Peliculas [idFilm=" + idFilm + ", Nombre=" + Nombre + ", CalificacionEdad=" + CalificacionEdad
				+ "]";
	}
	
	
}
