package com.silviocoutinho.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silviocoutinho.cursomc.domain.Categoria;
import com.silviocoutinho.cursomc.repositories.CategoriaRepository;
import com.silviocoutinho.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! ID: " + id
					+ ", Tipo: " + Categoria.class.getName());
		}
		return obj;		
	}

}
