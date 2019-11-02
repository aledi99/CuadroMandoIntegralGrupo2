package com.salesianostriana.cuadromandointegralgrupo2.model.usuarios;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum Role {
	USER ("USER"), 
	ADMIN ("ADMIN"), 
	SUPER_ADMIN ("SUPER_ADMIN"); 
	private String descripcion;
}
