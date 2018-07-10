package com.silviocoutinho.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias") //criacao do endpoint categorias
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)//usando o verbo GET
	public String listar() {
		return "REST OK!!!";
	}

}
