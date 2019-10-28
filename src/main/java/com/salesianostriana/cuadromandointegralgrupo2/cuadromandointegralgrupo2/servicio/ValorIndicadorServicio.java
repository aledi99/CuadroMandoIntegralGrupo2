package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.proceso.model.ValorIndicador;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.repositorio.proceso.ValorIndicadorRepository;
@Service
public class ValorIndicadorServicio extends ServicioBase<ValorIndicador, Long, ValorIndicadorRepository> {
	public void salvarListaValorIndicador (List<ValorIndicador> valores) {
		repositorio.saveAll(valores);
	}
}
