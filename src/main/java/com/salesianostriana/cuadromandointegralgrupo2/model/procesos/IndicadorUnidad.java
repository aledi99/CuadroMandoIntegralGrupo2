package com.salesianostriana.cuadromandointegralgrupo2.model.procesos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import com.salesianostriana.cuadromandointegralgrupo2.model.colegio.Unidad;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
public class IndicadorUnidad extends Indicador{
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@ManyToMany
	private List<Unidad> unidades;
	

	
}
