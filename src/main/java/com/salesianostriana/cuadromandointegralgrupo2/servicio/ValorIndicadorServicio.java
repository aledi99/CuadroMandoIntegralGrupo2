package com.salesianostriana.cuadromandointegralgrupo2.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.cuadromandointegralgrupo2.model.procesos.ValorIndicador;
import com.salesianostriana.cuadromandointegralgrupo2.repositorio.proceso.ValorIndicadorRepository;
@Service
public class ValorIndicadorServicio extends ServicioBase<ValorIndicador, Long, ValorIndicadorRepository> {
	public void salvarListaValorIndicador (List<ValorIndicador> valores) {
		repositorio.saveAll(valores);
	}
}
