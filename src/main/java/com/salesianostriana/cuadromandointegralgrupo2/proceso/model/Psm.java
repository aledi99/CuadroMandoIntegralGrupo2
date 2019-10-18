package com.salesianostriana.pruebaproyecto2.proceso.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.salesianostriana.pruebaproyecto2.colegio.model.Colegio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor
@AllArgsConstructor
@Entity
public class Psm {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nombre;
	private int peso;
	private Evaluacion evaluacion;
	@ToString.Exclude
	@ManyToOne (fetch =FetchType.LAZY)
	private Colegio colegio;
	@ToString.Exclude
	@ManyToOne (fetch =FetchType.LAZY)
	private PuntoControl puntoControl;
}
