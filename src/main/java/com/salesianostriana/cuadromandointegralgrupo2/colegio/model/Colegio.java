package com.salesianostriana.pruebaproyecto2.colegio.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.salesianostriana.pruebaproyecto2.proceso.model.Indicador;
import com.salesianostriana.pruebaproyecto2.proceso.model.PuntoControl;
import com.salesianostriana.pruebaproyecto2.proceso.model.ValorIndicadorCentro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @NoArgsConstructor
@AllArgsConstructor
@Entity
public class Colegio {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nombre;

	@OneToMany(mappedBy="colegio")
	private List<Etapa> etapas;
	
	@OneToMany(mappedBy="colegio")
	private List<PuntoControl> puntoControl;
	@OneToMany(mappedBy="indicador")
	private List<ValorIndicadorCentro> valores;
}
