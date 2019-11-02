package com.salesianostriana.cuadromandointegralgrupo2.model.procesos;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.salesianostriana.cuadromandointegralgrupo2.model.colegio.Colegio;
import com.salesianostriana.cuadromandointegralgrupo2.model.colegio.CursoAcademico;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
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
	
	@ManyToOne
	private PuntoControl puntoControl;
	
	@ManyToOne
	private CursoAcademico cursoAcademico;

	public Psm(String nombre, int peso, Evaluacion evaluacion, Colegio colegio, PuntoControl puntoControl,
			CursoAcademico cursoAcademico) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.evaluacion = evaluacion;
		this.colegio = colegio;
		this.puntoControl = puntoControl;
		this.cursoAcademico = cursoAcademico;
	}
	
	
}
