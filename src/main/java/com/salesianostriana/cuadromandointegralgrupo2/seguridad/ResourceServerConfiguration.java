package com.salesianostriana.cuadromandointegralgrupo2.seguridad;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
//Filtra las peticiones de autentificación una vez haya conseguido
//la app el token
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter{
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
       resources.resourceId("api");
       //tiene que coincidir con el .resourceIds("api");
       //de la clase donde configuramos OAuthConfiguration
	}
}
