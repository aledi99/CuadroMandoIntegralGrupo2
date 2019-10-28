package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.colegio.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.proceso.model.Psm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @NoArgsConstructor
@AllArgsConstructor
@Entity
public class CursoAcademico {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String descripcion;
	
	
}
