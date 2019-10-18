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
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor
@AllArgsConstructor
@Entity
public class Etapa {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nombre;
	private int peso;
	@ToString.Exclude
	@ManyToOne (fetch =FetchType.LAZY)
	private Colegio colegio;
	@OneToMany(mappedBy="etapa")
	private List<Curso> curso;
	@OneToMany(mappedBy="etapa")
	private List<Etapa> subEtapa;
	@ManyToOne
	private Etapa superEtapa;
}
