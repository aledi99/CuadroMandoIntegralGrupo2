package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.colegio.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Curso {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nombre;
	private int peso;
	
	@ToString.Exclude
	@ManyToOne (fetch =FetchType.LAZY)
	private Etapa etapa;
	
	@OneToMany(mappedBy="curso")
	private List<Unidad> unidad;
}
