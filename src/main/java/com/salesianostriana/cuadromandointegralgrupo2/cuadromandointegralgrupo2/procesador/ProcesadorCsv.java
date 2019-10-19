package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.procesador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.colegio.model.Colegio;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.proceso.model.ValorIndicador;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio.IndicadorCentroServicio;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio.IndicadorServicio;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio.ValorIndicadorCentroServicio;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio.ValorIndicadorServicio;
@Component

public class ProcesadorCsv {
	private static final String DELIMITADOR =";";
	private static final int PROCESO=1;
	private static final int INDICADOR=2;
	private static final int ETAPA=3;
	private static final int CICLO=4;
	private static final int CURSO=5;
	private static final int UNIDAD=6;
	private static final int VALORR=7;
	private static final int VALORC=8;
	private static final ValorIndicadorServicio valorindicadorservicio= new ValorIndicadorServicio();
	private static final IndicadorServicio indicadorservicio = new IndicadorServicio();
	private static final ValorIndicadorCentroServicio valorcentroservicio= new ValorIndicadorCentroServicio();
	private static final IndicadorCentroServicio indicadorcentroservicio=new IndicadorCentroServicio();
	//hay q insertar valorindicador
	public  static ValorIndicador mapToValorIndicador(String linea) {
		String [] datos=linea.split(DELIMITADOR);
		
		if(datos[VALORR].equals("NA")) {
			
		}
		return ValorIndicador.builder()
				.esNoAplica(datos[VALORR].equals("NA")?true:false)
				.valorConforme(Double.valueOf(datos[VALORC]))
				.valorReal(datos[VALORR].equals("NA")?-1.00:Double.valueOf(datos[VALORR]))
				.indicador(indicadorservicio.buscarPorNombre(datos[INDICADOR]))
				.psm(null)
				.build();
	}
	public void salvarValoresIndicadores(String fichero, boolean skipHeaders) throws IOException{
		List<ValorIndicador> lista= Files
				.lines(Paths.get(fichero))
				.skip(skipHeaders?1:0)
				.map(ProcesadorCsv::mapToValorIndicador)
				.collect(Collectors.toList());
		
		valorindicadorservicio.salvarListaValorIndicador(lista);
		
			
	}
	
	
	
}
