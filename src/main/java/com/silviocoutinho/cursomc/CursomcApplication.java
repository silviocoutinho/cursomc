package com.silviocoutinho.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.silviocoutinho.cursomc.domain.Categoria;
import com.silviocoutinho.cursomc.domain.Cidade;
import com.silviocoutinho.cursomc.domain.Cliente;
import com.silviocoutinho.cursomc.domain.Endereco;
import com.silviocoutinho.cursomc.domain.Estado;
import com.silviocoutinho.cursomc.domain.ItemPedido;
import com.silviocoutinho.cursomc.domain.Pagamento;
import com.silviocoutinho.cursomc.domain.PagamentoComBoleto;
import com.silviocoutinho.cursomc.domain.PagamentoComCartao;
import com.silviocoutinho.cursomc.domain.Pedido;
import com.silviocoutinho.cursomc.domain.Produto;
import com.silviocoutinho.cursomc.domain.enums.EstadoPagamento;
import com.silviocoutinho.cursomc.domain.enums.TipoCliente;
import com.silviocoutinho.cursomc.repositories.CategoriaRepository;
import com.silviocoutinho.cursomc.repositories.CidadeRepository;
import com.silviocoutinho.cursomc.repositories.ClienteRepository;
import com.silviocoutinho.cursomc.repositories.EnderecoRepository;
import com.silviocoutinho.cursomc.repositories.EstadoRepository;
import com.silviocoutinho.cursomc.repositories.ItemPedidoRepository;
import com.silviocoutinho.cursomc.repositories.PagamentoRepository;
import com.silviocoutinho.cursomc.repositories.PedidoRepository;
import com.silviocoutinho.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

	}
}
