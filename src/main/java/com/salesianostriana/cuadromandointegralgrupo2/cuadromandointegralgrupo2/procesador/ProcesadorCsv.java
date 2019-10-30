package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.procesador;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.proceso.model.ValorIndicador;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio.IndicadorServicio;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio.ValorIndicadorServicio;
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

	private static String nomIndicadorComillas;
	private static int contador=0;
	
	//FALTA HACER LOS INSERTS EN LAS TABLAS JOIN
	public  static ValorIndicador mapToValorIndicador(String linea,IndicadorServicio i) {
		String [] datos=linea.split(DELIMITADOR);
	
		return ValorIndicador.builder()
				.esNoAplica(datos[VALORR].equals("NA")?true:false)
				.valorConforme(Double.parseDouble(datos[VALORC]))
				.valorReal(datos[VALORR].equals("NA")?-1.00:Double.parseDouble(datos[VALORR].replace(",", ".")))
				.indicador(i.buscarPorNombre(obtenerNombreIndicador(datos[INDICADOR])))
				.psm(null)
				.build();
	}
	public void salvarValoresIndicadores(String fichero, boolean skipHeaders,IndicadorServicio i,ValorIndicadorServicio valorindicadorservicio) throws IOException{
		
		List<ValorIndicador> lista= Files
				.lines(Paths.get(fichero))
				.skip(skipHeaders?1:0)
				.map(x->mapToValorIndicador(x,i))
				.collect(Collectors.toList());
		
		valorindicadorservicio.salvarListaValorIndicador(lista);
		
			
	}
	public static String obtenerNombreIndicador(String nombre) {
		System.out.println("IMPORTANTE "+nombre);
		
		System.out.println("llamada "+contador);
		contador++;
		if(!nombre.contains("'"))
			nomIndicadorComillas=nombre;
		return nomIndicadorComillas;
		
	}
	
	
	
}
