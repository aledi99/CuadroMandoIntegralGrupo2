package com.salesianostriana.cuadromandointegralgrupo2.procesador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.cuadromandointegralgrupo2.model.colegio.Colegio;
import com.salesianostriana.cuadromandointegralgrupo2.model.colegio.Unidad;
import com.salesianostriana.cuadromandointegralgrupo2.model.procesos.Psm;
import com.salesianostriana.cuadromandointegralgrupo2.model.procesos.ValorIndicador;
import com.salesianostriana.cuadromandointegralgrupo2.model.procesos.ValorIndicadorCentro;
import com.salesianostriana.cuadromandointegralgrupo2.model.procesos.ValorIndicadorUnidad;
import com.salesianostriana.cuadromandointegralgrupo2.servicio.colegio.ColegioServicio;
import com.salesianostriana.cuadromandointegralgrupo2.servicio.colegio.UnidadServicio;
import com.salesianostriana.cuadromandointegralgrupo2.servicio.procesos.IndicadorServicio;
import com.salesianostriana.cuadromandointegralgrupo2.servicio.procesos.PsmServicio;
import com.salesianostriana.cuadromandointegralgrupo2.servicio.procesos.ValorIndicadorCentroServicio;
import com.salesianostriana.cuadromandointegralgrupo2.servicio.procesos.ValorIndicadorServicio;
import com.salesianostriana.cuadromandointegralgrupo2.servicio.procesos.ValorIndicadorUnidadServicio;
/**
 * 
 * @author Esperanza M Escacena
 *
 */
@Component
public class ProcesadorCsv {
	private static final String DELIMITADOR =";";
	private static final int PROCESO=0;
	private static final int INDICADOR=1;
	private static final int ETAPA=2;
	private static final int CICLO=3;
	private static final int CURSO=4;
	private static final int UNIDAD=5;
	private static final int VALORR=6;
	private static final int VALORC=7;
	private static PsmServicio psmServicio;
	private static ColegioServicio colegioServicio;
	private static ValorIndicadorCentroServicio valorIndicadorCentroServicio;
	private static IndicadorServicio indicadorServicio;
	private static ValorIndicadorServicio valorIndicadorServicio;
	private static UnidadServicio unidadServicio;
	private static ValorIndicadorUnidadServicio valorIndicadorUnidadServicio;
	private static String nomIndicadorComillas;
	private static int contador=0;
	
	@Autowired
	public void setServicios(ColegioServicio colegioServicio,ValorIndicadorCentroServicio valorIndicadorCentroServicio,
			IndicadorServicio indicadorServicio,ValorIndicadorServicio valorIndicadorServicio, UnidadServicio unidadServicio,
			ValorIndicadorUnidadServicio valorIndicadorUnidadServicio,PsmServicio psmServicio) {
		ProcesadorCsv.colegioServicio=colegioServicio;
		ProcesadorCsv.valorIndicadorCentroServicio=valorIndicadorCentroServicio;
		ProcesadorCsv.indicadorServicio=indicadorServicio;
		ProcesadorCsv.valorIndicadorServicio=valorIndicadorServicio;
		ProcesadorCsv.unidadServicio=unidadServicio;
		ProcesadorCsv.valorIndicadorUnidadServicio=valorIndicadorUnidadServicio;
		ProcesadorCsv.psmServicio=psmServicio;
	}

	public  static ValorIndicador mapToValorIndicador(String linea, Psm psm) {
		String [] datos=linea.split(DELIMITADOR);
		
		ValorIndicador vi= ValorIndicador.builder()
				.esNoAplica(datos[VALORR].equalsIgnoreCase("NA")?true:false)
				.valorConforme(Double.parseDouble(datos[VALORC]))
				.valorReal(datos[VALORR].equalsIgnoreCase("NA")?-1.00:Double.parseDouble(datos[VALORR].replace(",", ".")))
				.indicador(indicadorServicio.buscarPorNombre(obtenerNombreIndicador(datos[INDICADOR])))
				.psm(psm)
				.build();
		
		if(datos[ETAPA].equalsIgnoreCase("CENTRO")) {
			mapToValorIndicadorCentro(vi);
			
		}else {
			mapToValorIndicadorUnidad(vi, datos [UNIDAD]);
		}
		return vi;
	}
	
	public static void mapToValorIndicadorCentro(ValorIndicador vi) {

		for (Colegio i : colegioServicio.findAll()) {
			valorIndicadorCentroServicio.save(new ValorIndicadorCentro(
					vi.getId(),
					vi.getValorReal(),
					vi.getValorConforme(),
					vi.isEsNoAplica(),
					vi.getIndicador(),
					vi.getPsm(),
					i));
		}
	
	}
	public static void mapToValorIndicadorUnidad(ValorIndicador vi,String unidad) {
		Unidad u=unidadServicio.buscarUnidadPorNombre(unidad);
		
		valorIndicadorUnidadServicio.save(new ValorIndicadorUnidad(
				vi.getId(),
				vi.getValorReal(),
				vi.getValorConforme(),
				vi.isEsNoAplica(),
				vi.getIndicador(),
				vi.getPsm(),
				u
				));
		
	
	}
	public void salvarValoresIndicadores(String fichero, boolean skipHeaders,Psm psm) throws IOException{
		List<ValorIndicador> lista= Files
				.lines(Paths.get(fichero))
				.skip(skipHeaders?1:0)
				.map(x->mapToValorIndicador(x,psm))
				.collect(Collectors.toList());
		
		valorIndicadorServicio.salvarListaValorIndicador(lista);
		
			
	}
	public static String obtenerNombreIndicador(String nombre) {
		if(!nombre.equals(" '' "))
			nomIndicadorComillas=nombre;
		return nomIndicadorComillas;
		
	}
	
	
	
}
