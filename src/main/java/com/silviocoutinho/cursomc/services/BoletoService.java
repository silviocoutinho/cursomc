package com.silviocoutinho.cursomc.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.silviocoutinho.cursomc.domain.PagamentoComBoleto;

@Service
public class BoletoService {

	public static void prencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido, int quantidadeDeDias) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(instanteDoPedido);
		cal.add(Calendar.DAY_OF_MONTH, quantidadeDeDias);
		pagto.setDataVencimento(cal.getTime());

	}

}
