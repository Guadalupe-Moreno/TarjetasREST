package com.ibm.academia.apirest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.apirest.entities.Cliente;
import com.ibm.academia.apirest.repositories.ClienteRepository;

@Service
public class ClienteDAOImpl implements ClienteDAO
{
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Cliente> buscarPorId(Integer id) {
		return clienteRepository.findById(id);
	}

	@Override
	@Transactional
	public Cliente guardar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	@Transactional
	public void eliminarPorId(Integer id) {
		clienteRepository.deleteById(id);
		
	}

}
