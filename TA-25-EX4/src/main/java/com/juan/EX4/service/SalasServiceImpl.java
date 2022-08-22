package com.juan.EX4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.juan.EX4.dao.ISalasDAO;
import com.juan.EX4.dto.Salas;

@Service
public class SalasServiceImpl implements ISalasService{
	
	@Autowired
	ISalasDAO isalasDAO;
	
	@Override
	public List<Salas> listarSalas(){
		return isalasDAO.findAll();
	}


	@Override
	public Salas guardarSalas(Salas salas) {
		return isalasDAO.save(salas);
	}

	@Override
	public Salas SalasPorId(int id) {
		return isalasDAO.findById(id).get();
	}

	@Override
	public Salas actualizarSalas(Salas salas) {
		
		return isalasDAO.save(salas);
	}

	@Override
	public void eliminarSalas(int id) {
		isalasDAO.deleteById(id);
		
	}
}
