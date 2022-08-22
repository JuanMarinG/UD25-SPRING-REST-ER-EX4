package com.juan.EX4.service;

import java.util.List;

import com.juan.EX4.dto.Salas;

public interface ISalasService {

	//ALL
	public List<Salas> listarSalas();
	
	//CREATE
	public Salas guardarSalas (Salas salas);
	
	//READ
	public Salas SalasPorId (int id);
	
	//UPDATE
	public Salas actualizarSalas (Salas salas);
	
	//DELETE
	public void eliminarSalas (int id);
}
