package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.files.StorageService;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.files.UploadFileResponse;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class FicherosController {

	@Autowired
	private StorageService storageService;

	public FicherosController(StorageService storageService) {
		this.storageService = storageService;
	}

	@PostMapping("/uploadFile")
	public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file) {
		String fileName = storageService.store(file);

		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile/")
				.path(fileName).toUriString();

		return new UploadFileResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
	}
	
	@PostMapping("/uploadMultipleFiles")
    public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        return Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(file))
                .collect(Collectors.toList());
    }

}
