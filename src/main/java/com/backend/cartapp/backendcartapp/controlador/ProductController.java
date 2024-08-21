package com.backend.cartapp.backendcartapp.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.cartapp.backendcartapp.model.Product;
import com.backend.cartapp.backendcartapp.servicios.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	
	@GetMapping("/products")
	public List<Product> list(){
		return service.findAll();
	}
	
}
