package com.juan.EX4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.EX4.dao.IPeliculasDAO;
import com.juan.EX4.dto.Peliculas;

@Service
public class PeliculasServiceImpl implements IPeliculasService{

	@Autowired
	IPeliculasDAO ipeliculasDAO;
	
	@Override
	public List<Peliculas> listarPeliculas() {
		return ipeliculasDAO.findAll();
		
	}

	@Override
	public Peliculas guardarPeliculas(Peliculas peliculas) {

		return ipeliculasDAO.save(peliculas);
	}

	@Override
	public Peliculas PeliculasPorId(int id) {
		return ipeliculasDAO.findById(id).get();
	}

	@Override
	public Peliculas actualizarPeliculas(Peliculas peliculas) {
	
		return ipeliculasDAO.save(peliculas);
	}

	@Override
	public void eliminarPeliculas(int id) {
		ipeliculasDAO.deleteById(id);
		
	}

}
