package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.proceso.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.colegio.model.Colegio;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.colegio.model.CursoAcademico;

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
	@ManyToOne
	private PuntoControl puntoControl;
	
	@ManyToOne
	private CursoAcademico cursoAcademico;
}
