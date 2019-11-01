package com.salesianostriana.cuadromandointegralgrupo2.model.procesos;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

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
public class ValorIndicadorUnidad extends ValorIndicador{

	@ToString.Exclude
	@ManyToOne (fetch =FetchType.LAZY)
	private Unidad unidad;

	public ValorIndicadorUnidad(long id, double valorReal, double valorConforme, boolean esNoAplica,
			Indicador indicador, Psm psm, Unidad unidad) {
		super(id, valorReal, valorConforme, esNoAplica, indicador, psm);
		this.unidad=unidad;
	}
	
	

}
