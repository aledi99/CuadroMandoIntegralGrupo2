package com.salesianostriana.cuadromandointegralgrupo2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.salesianostriana.cuadromandointegralgrupo2.files.FileStorageProperties;
import com.salesianostriana.cuadromandointegralgrupo2.procesador.ProcesadorCsv;
import com.salesianostriana.cuadromandointegralgrupo2.servicio.procesos.PsmServicio;

@SpringBootApplication
@EnableConfigurationProperties({ FileStorageProperties.class })
public class CuadroMandoIntegralGrupo2Application {

	public static void main(String[] args) {
		SpringApplication.run(CuadroMandoIntegralGrupo2Application.class, args);
	}

	@Bean
	public CommandLineRunner init(ApplicationContext context, ProcesadorCsv csv, PsmServicio psmServicio) {
		return args -> {
			
			csv.salvarValoresIndicadores("PSM_Final_csv.csv", true,psmServicio.findById(602L));

		};
	}
}
