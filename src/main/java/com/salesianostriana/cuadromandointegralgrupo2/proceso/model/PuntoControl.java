package com.salesianostriana.pruebaproyecto2.proceso.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import com.salesianostriana.pruebaproyecto2.colegio.model.Colegio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data @NoArgsConstructor
@AllArgsConstructor
@Entity
public class PuntoControl {
	//SON MOMENTOS EN EL QUE HAY QUE RECOGER LA INFORMACIÓN.
	//CONTROL FINAL. 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;
	@OneToMany(mappedBy="puntoControl")
	private List<ValorIndicador> valores;
	@ToString.Exclude
	@ManyToOne (fetch =FetchType.LAZY)
	private Colegio colegio;
	@OneToMany(mappedBy="puntoControl")
	private List<Psm> psm;
}
