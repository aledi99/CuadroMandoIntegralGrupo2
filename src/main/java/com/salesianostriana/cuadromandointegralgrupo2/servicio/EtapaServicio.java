package com.salesianostriana.cuadromandointegralgrupo2.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.cuadromandointegralgrupo2.model.colegio.Etapa;
import com.salesianostriana.cuadromandointegralgrupo2.repositorio.colegio.EtapaRepository;
@Service
public class EtapaServicio extends ServicioBase<Etapa, Long, EtapaRepository> {
	public void salvarListaEtapas (List<Etapa> etapas) {
		repositorio.saveAll(etapas);
	}
}
