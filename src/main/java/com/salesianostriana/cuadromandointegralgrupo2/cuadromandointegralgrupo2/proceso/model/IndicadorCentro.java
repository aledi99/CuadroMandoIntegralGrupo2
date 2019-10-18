package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.proceso.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.colegio.model.Colegio;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@DiscriminatorValue("CENTRO")
public class IndicadorCentro extends Indicador {
	@OneToMany(mappedBy="indicador")
	private List<ValorIndicadorCentro> valores;
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@ManyToMany
	private List<Colegio> centros;
	
}
