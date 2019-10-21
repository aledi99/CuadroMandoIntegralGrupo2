package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.repositorio.proceso;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.proceso.model.Indicador;

public interface IndicadorRepository extends JpaRepository<Indicador, Long> {
	Indicador findByNombreIgnoreCase(String nombre);
}
