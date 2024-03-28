package com.jopaulo.controlepontoacesso.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private BigDecimal tolerancia;
	private LocalDateTime inicioJornada;
	private LocalDateTime fimJornada;
	@ManyToOne
	private CategoriaUsuario categoriaUsuario;
	@ManyToOne
	private Empresa empresa;
	@ManyToOne
	private NivelAcesso  nivelAcesso;
	@ManyToOne
	private JornadaTrabalho jornadaTrabalho;
}
