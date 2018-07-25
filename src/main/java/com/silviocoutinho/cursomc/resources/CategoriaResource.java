package com.silviocoutinho.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.silviocoutinho.cursomc.domain.Categoria;
import com.silviocoutinho.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias") //criacao do endpoint categorias
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)//usando o verbo GET
	public ResponseEntity<?> find(@PathVariable Integer id) {
			Categoria obj = service.buscar(id);			
			return ResponseEntity.ok().body(obj);

	}

}
