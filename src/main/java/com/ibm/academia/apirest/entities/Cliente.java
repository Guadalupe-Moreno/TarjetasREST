package com.ibm.academia.apirest.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import com.ibm.academia.apirest.enums.Preferencia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cliente implements Serializable
{
	private Integer id;
	private Integer edad;
	private BigDecimal sueldo;
	private Preferencia preferencia;
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}

	private static final long serialVersionUID = 2911015020675230220L;
}
