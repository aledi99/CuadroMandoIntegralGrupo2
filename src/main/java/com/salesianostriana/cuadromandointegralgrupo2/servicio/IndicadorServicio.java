package com.salesianostriana.cuadromandointegralgrupo2.servicio;

import org.springframework.stereotype.Service;

import com.salesianostriana.cuadromandointegralgrupo2.model.procesos.Indicador;
import com.salesianostriana.cuadromandointegralgrupo2.repositorio.proceso.IndicadorRepository;
@Service
public class IndicadorServicio extends ServicioBase<Indicador, Long, IndicadorRepository> {
	
	
	public Indicador buscarPorNombre(String nombre) {
		
		return repositorio.findByNombreIgnoreCase(nombre);
	}

}
