package com.salesianostriana.pruebaproyecto2.proceso.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.salesianostriana.pruebaproyecto2.colegio.model.Unidad;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@DiscriminatorValue("UNIDAD")
public class IndicadorUnidad extends Indicador{
	
	@ManyToMany 
	private List<Unidad> unidades;
	@OneToMany(mappedBy="indicador")
	private List<ValorIndicador> valores;
	
}
