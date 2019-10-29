package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.files.FileStorageProperties;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.procesador.ProcesadorCsv;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio.CursoServicio;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio.EtapaServicio;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio.IndicadorServicio;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio.UnidadServicio;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio.ValorIndicadorServicio;

@SpringBootApplication
@EnableConfigurationProperties({ FileStorageProperties.class })
public class CuadroMandoIntegralGrupo2Application {

	public static void main(String[] args) {
		SpringApplication.run(CuadroMandoIntegralGrupo2Application.class, args);
	}

	@Bean
	public CommandLineRunner init(ApplicationContext context, ProcesadorCsv csv, IndicadorServicio indicadorservicio,
			ValorIndicadorServicio valorindicadorservicio, EtapaServicio etapaServicio,
			CursoServicio cursoServicio, UnidadServicio unidadServicio) {
		return args -> {
			System.out.println("busqueda " + indicadorservicio
					.buscarPorNombre("IND 06.2 E Mejora en indicadores de la satisfacción del cliente"));
			csv.salvarValoresIndicadores("PSM_Final_csv.csv", true, indicadorservicio, valorindicadorservicio);

		};
	}
}
