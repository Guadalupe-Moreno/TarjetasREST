package com.ibm.academia.apirest.repositories;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer>
{
	@Query("select c from Cliente c where upper(c.preferencia) = upper(?1) and c.sueldoMinimo<?2 and sueldoMaximo>?2 and edadMinima<?3 and edadMaxima>?3")
	public List<Cliente> findByPreferenciaAndSueldoAndEdad(String preferencia , BigDecimal sueldo , Integer edad);
}
