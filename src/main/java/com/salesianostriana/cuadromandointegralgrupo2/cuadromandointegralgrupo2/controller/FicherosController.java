package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.datasource.embedded.ConnectionProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.files.FileStorageService;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.files.UploadFileResponse;

@RestController
public class FicherosController {

	private static final Logger logger = LoggerFactory.getLogger(FicherosController.class);

	@Autowired
	private FileStorageService fileStorageService;

	public FicherosController(FileStorageService fileStorageService) {
		this.fileStorageService = fileStorageService;
	}

	@PostMapping("/uploadFile")
	public UploadFileResponse uploadFile(@RequestPart("properties") ConnectionProperties properties,
			@RequestPart("file") MultipartFile file) {
		String fileName = fileStorageService.storeFile(file);

		return fileStorageService.uploadFile(properties, file, fileName);
	}

	@PostMapping("/uploadMultipleFiles")
	public List<UploadFileResponse> uploadMultipleFiles(@RequestPart("properties") ConnectionProperties properties,
			@RequestPart("files") MultipartFile[] files) {
		return Arrays.asList(files).stream().map(file -> uploadFile(null, file)).collect(Collectors.toList());
	}

	@GetMapping("/downloadFile/{fileName:.+}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
		// Load file as Resource
		Resource resource = fileStorageService.loadFileAsResource(fileName);

		// Try to determine file's content type
		String contentType = null;
		try {
			contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
		} catch (IOException ex) {
			logger.info("Could not determine file type.");
		}

		// Fallback to the default content type if type could not be determined
		if (contentType == null) {
			contentType = "application/octet-stream";
		}

		return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
				.body(resource);
	}

}
