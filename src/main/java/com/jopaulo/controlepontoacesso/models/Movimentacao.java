package com.jopaulo.controlepontoacesso.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
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
public class Movimentacao {
	
	@NoArgsConstructor
	@AllArgsConstructor
	@EqualsAndHashCode
	@Embeddable
	public class MovimentacaoId implements Serializable{
		private static final long serialVersionUID = 1L;
		private Long idMovimento;
		private Long idUsuario;
	}
	
	@EmbeddedId
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private MovimentacaoId id;
	private LocalDateTime dataEntrada;
	private LocalDateTime saidaEntrada;
	private BigDecimal periodo;
	@ManyToOne
	private Ocorrencia ocorrencia;
	@ManyToOne
	private Calendario calendario;
}
