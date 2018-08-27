package com.silviocoutinho.cursomc.services.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerMapping;

import com.silviocoutinho.cursomc.domain.Cliente;
import com.silviocoutinho.cursomc.dto.ClienteDTO;
import com.silviocoutinho.cursomc.repositories.ClienteRepository;
import com.silviocoutinho.cursomc.resources.exception.FieldMessage;

public class ClienteUpdateValidator implements ConstraintValidator<ClienteUpdate, ClienteDTO> {

	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private ClienteRepository repo;

	@Override
	public void initialize(ClienteUpdate ann) {

	}

	@Override
	public boolean isValid(ClienteDTO obj, ConstraintValidatorContext context) {

		@SuppressWarnings("unchecked")
		Map<String, String> map = (Map<String, String>)request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);		
		Integer urlId = Integer.parseInt(map.get("id"));
		
		List<FieldMessage> list = new ArrayList<>();

		Cliente aux = repo.findByEmail(obj.getEmail());
		if (aux != null && !aux.getId().equals(urlId)) {
			list.add(new FieldMessage("email", "E-mail já existente"));
		}

		// inclua os testes aqui, inserindo erros na lista
		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();

	}

}
