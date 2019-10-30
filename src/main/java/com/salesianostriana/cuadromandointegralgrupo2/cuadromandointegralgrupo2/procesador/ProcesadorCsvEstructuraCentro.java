package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.procesador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.colegio.model.Curso;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.colegio.model.Etapa;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.colegio.model.Unidad;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio.CursoServicio;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio.EtapaServicio;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio.UnidadServicio;

import lombok.RequiredArgsConstructor;
/**
 * 
 * @author Álvaro Márquez
 *
 */
@Component
@RequiredArgsConstructor
public class ProcesadorCsvEstructuraCentro {
	private static final String DELIMITADOR = ";";
	private static final int PRIMERAETAPA = 0;

	private static int contador = 0;

	public static void salvarLineaEstructuraCentro(String linea, EtapaServicio etapaServicio,
			CursoServicio cursoServicio, UnidadServicio unidadServicio) {
		String[] datos = linea.split(DELIMITADOR);
		List<Etapa> etapas = new ArrayList<>();
		// @formatter:off

		Etapa e = Etapa.builder().nombre(datos[PRIMERAETAPA]).build();
		etapas.add(e);

		for (int i = 1; i < datos.length - 2; i++) {
			e = Etapa.builder().nombre(datos[i]).superEtapa(e).build();
			etapas.add(e);
		}

		etapaServicio.salvarListaEtapas(etapas);

		Curso c = Curso.builder().nombre(datos[datos.length - 1]).etapa(e).build();

		cursoServicio.save(c);

		Unidad u = Unidad.builder().nombre(datos[datos.length - 2]).curso(c).build();

		unidadServicio.save(u);

		// @formatter:on

	}

	public void salvarEstructuraCentro(String fichero, boolean skipHeaders, EtapaServicio etapaServicio,
			CursoServicio cursoServicio, UnidadServicio unidadServicio) throws IOException {
		
		// @formatter:off
		

		Files.lines(Paths.get(fichero))
		.skip(skipHeaders?1:0)
		.forEach( l -> salvarLineaEstructuraCentro(l, etapaServicio, cursoServicio, unidadServicio));
		
		 
		// @formatter:on
	}

}
