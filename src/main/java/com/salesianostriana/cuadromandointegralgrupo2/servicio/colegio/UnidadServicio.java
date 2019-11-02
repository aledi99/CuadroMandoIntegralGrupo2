package com.salesianostriana.cuadromandointegralgrupo2.servicio.colegio;

import org.springframework.stereotype.Service;

import com.salesianostriana.cuadromandointegralgrupo2.model.colegio.Unidad;
import com.salesianostriana.cuadromandointegralgrupo2.repositorio.colegio.UnidadRepository;
import com.salesianostriana.cuadromandointegralgrupo2.servicio.procesos.ServicioBase;
@Service
public class UnidadServicio extends ServicioBase<Unidad, Long, UnidadRepository> {
	
	public Unidad buscarUnidadPorNombre(String nombre) {
		return repositorio.findByNombreIgnoreCase(nombre);
	}
}
