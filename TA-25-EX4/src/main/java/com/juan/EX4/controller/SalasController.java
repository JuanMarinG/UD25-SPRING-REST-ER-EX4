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

import com.juan.EX4.dto.Salas;
import com.juan.EX4.service.SalasServiceImpl;

@RestController
@RequestMapping("/api")
public class SalasController {

	@Autowired SalasServiceImpl salasServiceImpl;
	
	@GetMapping("/salas")
	public List <Salas>listarSalas(){
		return salasServiceImpl.listarSalas();
	}
	
	@PostMapping("/salas")
	public Salas guardarSalas (Salas salas) {
		return salasServiceImpl.guardarSalas(salas);
	}
	
	@GetMapping("/salas/{id}")
	public Salas SalasPorId(@PathVariable(name="idCodigo") int id) {
		Salas salasPorId = new Salas();
		salasPorId = salasServiceImpl.SalasPorId(id);
		return salasPorId;
	}
	
	@PutMapping("/salas/{id}")
	public Salas actualizarSalas(@PathVariable(name="idCodigo")int id, @RequestBody Salas salas){
		Salas sala_seleccionada = new Salas();
		Salas sala_actualizada = new Salas();
		
		sala_seleccionada = salasServiceImpl.SalasPorId(id);
		sala_seleccionada.setIdCodigo(salas.getIdCodigo());
		sala_actualizada = salasServiceImpl.actualizarSalas(sala_seleccionada);
		return sala_actualizada;
	}
	
	@DeleteMapping("/salas/{id}")
	public void eliminarSalas (int id) {
		salasServiceImpl.eliminarSalas(id);
	}
	
}
