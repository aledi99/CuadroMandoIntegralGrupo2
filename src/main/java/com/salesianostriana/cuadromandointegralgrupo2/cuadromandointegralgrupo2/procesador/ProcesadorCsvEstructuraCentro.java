package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.procesador;

import org.springframework.stereotype.Component;

import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.colegio.model.Unidad;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio.UnidadServicio;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProcesadorCsvEstructuraCentro {
	private static final String DELIMITADOR =";";
	
	private static String nomIndicadorComillas;
	private static int contador = 0;
	
	private final UnidadServicio unidadServicio;
		
	public static Unidad mapToUnidad(String linea) {
		String [] datos = linea.split(DELIMITADOR);
		
		
		
		return null;
	}
	

}
