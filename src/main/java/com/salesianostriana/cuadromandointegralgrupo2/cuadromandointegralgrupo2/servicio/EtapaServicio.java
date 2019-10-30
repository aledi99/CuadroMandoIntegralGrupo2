package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.colegio.model.Etapa;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.repositorio.colegio.EtapaRepository;
@Service
public class EtapaServicio extends ServicioBase<Etapa, Long, EtapaRepository> {
	public void salvarListaEtapas (List<Etapa> etapas) {
		repositorio.saveAll(etapas);
	}
}
