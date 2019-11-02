package com.salesianostriana.cuadromandointegralgrupo2.model.procesos;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Inheritance(strategy = InheritanceType.JOINED)
public class ValorIndicador {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private double valorReal;
	private double valorConforme;
	private boolean esNoAplica;//SI ES FINAL O EN TODAS LAS EVALUACIONES.
	
	@ToString.Exclude
	@ManyToOne (fetch =FetchType.LAZY)
	private Indicador indicador;
	
	@ManyToOne
	private Psm psm;
}
