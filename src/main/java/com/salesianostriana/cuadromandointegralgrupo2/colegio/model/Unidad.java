package com.salesianostriana.pruebaproyecto2.colegio.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.salesianostriana.pruebaproyecto2.proceso.model.Indicador;
import com.salesianostriana.pruebaproyecto2.proceso.model.ValorIndicadorUnidad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor
@AllArgsConstructor
@Entity
public class Unidad {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nombre;
	private int peso;
	@ToString.Exclude
	@ManyToOne (fetch =FetchType.LAZY)
	private Curso curso;
	@OneToMany
	private List<ValorIndicadorUnidad> valores;
	@ManyToMany
	private List<Indicador> indicadores;
}
