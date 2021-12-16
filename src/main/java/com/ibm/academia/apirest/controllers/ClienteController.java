package com.ibm.academia.apirest.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.apirest.exceptions.BadRequestException;
import com.ibm.academia.apirest.entities.Cliente;
import com.ibm.academia.apirest.services.ClienteDAO;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	private ClienteDAO clienteDao;

	@GetMapping("/datos") 
	public List<Cliente> ingresaDatos(String preferencia, BigDecimal sueldo, Integer edad){
		List<Cliente> clientes = clienteDao.findByPreferenciaAndSueldoAndEdad(preferencia, sueldo, edad);
		if(clientes.isEmpty())
			throw new BadRequestException("No contamos con una tarjeta a su medida");
	return clientes;
	}
}
