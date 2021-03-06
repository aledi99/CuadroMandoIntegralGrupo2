package com.salesianostriana.cuadromandointegralgrupo2.model.procesos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum Evaluacion {
	PRIMERA ("1º Evaluación"),
	SEGUNDA ("2º Evaluación"),
	TERCERA ("3º Evaluación"),
	FINAL ("Final"),
	SEPTIEMBRE("Septiembre");
	private String descripcion;
}
