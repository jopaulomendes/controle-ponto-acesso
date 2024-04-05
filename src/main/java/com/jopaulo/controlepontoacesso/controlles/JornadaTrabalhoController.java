package com.jopaulo.controlepontoacesso.controlles;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jopaulo.controlepontoacesso.models.JornadaTrabalho;
import com.jopaulo.controlepontoacesso.services.JornadaTrabalhoService;

@RestController
@RequestMapping(path = "/jornada")
public class JornadaTrabalhoController {

	@Autowired
	private JornadaTrabalhoService service;

	@GetMapping
	public List<JornadaTrabalho> getAll() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<JornadaTrabalho> getById(@PathVariable Long id) {
		return ResponseEntity
				.ok(service.getById(id).orElseThrow(() -> new NoSuchElementException("Registro não encontrado")));
	}

	@PostMapping
	public JornadaTrabalho save(@RequestBody JornadaTrabalho entity) {
		return service.save(entity);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<JornadaTrabalho> update(@PathVariable Long id, @RequestBody JornadaTrabalho entity) {
		entity = service.update(id, entity);
		return ResponseEntity.ok().body(entity);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<JornadaTrabalho> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
