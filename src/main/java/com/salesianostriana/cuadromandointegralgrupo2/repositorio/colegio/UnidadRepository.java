package com.salesianostriana.cuadromandointegralgrupo2.repositorio.colegio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.cuadromandointegralgrupo2.model.colegio.Unidad;

public interface UnidadRepository extends JpaRepository<Unidad, Long> {
	Unidad findByNombreIgnoreCase(String nombre);
}
