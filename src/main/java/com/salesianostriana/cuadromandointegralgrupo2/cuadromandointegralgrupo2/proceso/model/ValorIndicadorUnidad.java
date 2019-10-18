package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.proceso.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.colegio.model.Unidad;

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

}
