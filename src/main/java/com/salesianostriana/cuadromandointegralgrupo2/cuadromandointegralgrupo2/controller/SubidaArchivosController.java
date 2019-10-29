package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.files.StorageService;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.proceso.model.Psm;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.servicio.PsmServicio;

@Controller
public class SubidaArchivosController {
	
	@Autowired
	private StorageService storageService;
	@Autowired
	private PsmServicio psmService;
	
	@PostMapping("/nuevo/submit")
	public String submitNuevoProducto(@Valid Psm psm, BindingResult bindingResult, 
			@RequestPart("file") MultipartFile file, Model model) {

		if (bindingResult.hasErrors()) {
			return "admin/form-producto";
		} else {
			
			if (!file.isEmpty()) {
				String imagen = storageService.store(file);
				psm.setImagen(MvcUriComponentsBuilder
						.fromMethodName(FicherosController.class, "serveFile", imagen)
						.build().toUriString());
			}
			
			psmService.save(psm);
			return "redirect:/admin/producto/";

		}

	}

}
