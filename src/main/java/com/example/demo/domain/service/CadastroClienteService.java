package com.example.demo.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.api.domain.exception.NegocioException;
import com.example.demo.domain.model.Cliente;
import com.example.demo.domain.repository.ClienteRepository;

@Service
public class CadastroClienteService {

	
	@Autowired
	ClienteRepository clienteRepository;

	public Cliente salvar(Cliente cliente) {
		Cliente clienteExistente = clienteRepository.findByEmail(cliente.getEmail());
		
		if(clienteExistente != null && !clienteExistente.equals(cliente)){
			throw new NegocioException("já existe usuario com o email cadastrado!");
		}
		
		return clienteRepository.save(cliente);
	}
	public void excluir(Long clienteId) {
		  clienteRepository.deleteById(clienteId);
	}
}
