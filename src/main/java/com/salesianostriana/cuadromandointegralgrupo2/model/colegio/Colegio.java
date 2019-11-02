package com.salesianostriana.cuadromandointegralgrupo2.model.colegio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.salesianostriana.cuadromandointegralgrupo2.model.procesos.PuntoControl;

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
	
}
