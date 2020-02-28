package com.example.controller;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.model.Gallery;

	
	@RestController
	@RequestMapping("/")
	public class GalleryController {
		
		
		
		@Autowired
		private RestTemplate restTemplate;
		
		@Autowired
		private Environment env;
		
		@RequestMapping("/")
		public String home() {
			
			return "Hello from Gallery Service running at port: " + env.getProperty("local.server.port");
		}
	  

		@RequestMapping("/{id}")
		public Gallery getGallery(@PathVariable final int id) {
			
			
			// create gallery object
			Gallery gallery = new Gallery();
			gallery.setId(id);

			// get list of available images 
			// @SuppressWarnings("unchecked")    // we'll throw an exception from image service to simulate a failure
			List<Object> images = restTemplate.getForObject("http://image-service/images/", List.class);
			gallery.setImages(images);
		
			return gallery;
		}
		
	}


