package com.salesianostriana.cuadromandointegralgrupo2.repositorio.procesos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.cuadromandointegralgrupo2.model.procesos.Indicador;

public interface IndicadorRepository extends JpaRepository<Indicador, Long> {
	Indicador findByNombreIgnoreCase(String nombre);
}
