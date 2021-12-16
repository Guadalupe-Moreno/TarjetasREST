package com.ibm.academia.apirest.services;

import java.math.BigDecimal;
import java.util.List;

import com.ibm.academia.apirest.entities.Cliente;

public interface ClienteDAO {
	public List<Cliente> findByPreferenciaAndSueldoAndEdad(String preferencia , BigDecimal sueldo , Integer edad);
}
