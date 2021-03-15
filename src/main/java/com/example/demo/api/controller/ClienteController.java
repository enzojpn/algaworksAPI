package com.example.demo.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar(){

		Cliente c1 = new Cliente();
		c1.setId(1L);
		c1.setNome("Joao");
		c1.setEmail("email@set.com");
		c1.setTelefone("(11) 4424-5255");
		

		Cliente c2 = new Cliente();
		c2.setId(1L);
		c2.setNome("ana");
		c2.setEmail("ana@ft.com");
		c2.setTelefone("(11) 3435-7895");
		
		
		
		return Arrays.asList(c1, c2);
	}
	
}
