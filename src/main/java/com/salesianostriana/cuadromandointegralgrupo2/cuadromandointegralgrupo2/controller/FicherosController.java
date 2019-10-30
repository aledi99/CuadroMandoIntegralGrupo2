package com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.files.FileSystemStorageService;
import com.salesianostriana.cuadromandointegralgrupo2.cuadromandointegralgrupo2.files.UploadFileResponse;

@Controller
public class FicherosController {

	private static final Logger logger = LoggerFactory.getLogger(FicherosController.class);

	@Autowired
	private FileSystemStorageService fileStorageService;


	@PostMapping("/uploadFile")
	public UploadFileResponse uploadFile(@RequestPart("properties") String properties,
			@RequestPart("file") MultipartFile file) {
		DateTimeFormatter timeStampPattern = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		String fileName =fileStorageService.store(file)+"_"+timeStampPattern.format(LocalDateTime.now());
		
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
		Resource resource = fileStorageService.loadAsResource(fileName);

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
