package com.ibm.academia.apirest.services;

import java.math.BigDecimal;
import java.util.List;

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
	public List<Cliente> findByPreferenciaAndSueldoAndEdad(String preferencia, BigDecimal sueldo, Integer edad) {
		return clienteRepository.findByPreferenciaAndSueldoAndEdad(preferencia, sueldo, edad);
	}
}
