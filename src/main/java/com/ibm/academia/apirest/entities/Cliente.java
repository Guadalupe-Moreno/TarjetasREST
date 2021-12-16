package com.ibm.academia.apirest.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Entity
@Table (name = "clientes")
public class Cliente implements Serializable
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (name = "edad_minima", nullable = false)
	private Integer edadMinima;
	
	@Column (name = "edad_maxima", nullable = false)
	private Integer edadMaxima;
	
	@Column (name = "sueldo_minimo", nullable = false)
	private BigDecimal sueldoMinimo;
	
	@Column (name = "sueldo_maximo", nullable = true)
	private BigDecimal sueldoMaximo;
	
	@Column(name = "preferencia")
	private String preferencia;
	
	@Column (name = "tipo_tarjeta")
	private String tipoTarjeta;
	
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
