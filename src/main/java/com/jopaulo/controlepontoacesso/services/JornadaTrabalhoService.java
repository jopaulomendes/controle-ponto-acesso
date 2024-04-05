package com.jopaulo.controlepontoacesso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jopaulo.controlepontoacesso.models.JornadaTrabalho;
import com.jopaulo.controlepontoacesso.repositorys.JornadaTrabalhoRepository;

@Service
public class JornadaTrabalhoService {

	@Autowired
	private JornadaTrabalhoRepository repository;
	
	public List<JornadaTrabalho> findAll() {
		return repository.findAll();
	}

	public Optional<JornadaTrabalho> getById(Long id) {
		return repository.findById(id);
	}
	
	public JornadaTrabalho save(JornadaTrabalho entity) {
		return repository.save(entity);
	}
	
	public JornadaTrabalho update(Long id, JornadaTrabalho entity) {
		return repository.save(entity);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
