package com.jopaulo.controlepontoacesso.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
public class BancoHoras {
	
	@NoArgsConstructor
	@AllArgsConstructor
	@EqualsAndHashCode
	@Embeddable
	public class BancoHorasId implements Serializable{
		private static final long serialVersionUID = 1L;
		private Long idBancoHoras;
		private Long idMovimentacao;
		private Long idUsuario;
	}
	
	@EmbeddedId
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BancoHorasId id;
	private LocalDateTime dataTrabalhada;
	private BigDecimal quantidadeHoras;
	private BigDecimal saldoHoras;
}
