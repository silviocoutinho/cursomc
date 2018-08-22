package com.silviocoutinho.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silviocoutinho.cursomc.domain.Pedido;
import com.silviocoutinho.cursomc.repositories.PedidoRepository;
import com.silviocoutinho.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Pedido obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! ID: " + id
					+ ", Tipo: " + Pedido.class.getName());
		}
		return obj;		
	}

}
