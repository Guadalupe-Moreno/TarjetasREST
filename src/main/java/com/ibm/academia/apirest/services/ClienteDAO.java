package com.ibm.academia.apirest.services;

import java.util.Optional;

import com.ibm.academia.apirest.entities.Cliente;

public interface ClienteDAO {
	public Optional<Cliente> buscarPorId(Integer id);
	public Cliente guardar(Cliente cliente);
	public Iterable<Cliente> buscarTodos();
	public void eliminarPorId(Integer id);
}
