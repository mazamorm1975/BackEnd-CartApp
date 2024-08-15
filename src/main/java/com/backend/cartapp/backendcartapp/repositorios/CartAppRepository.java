package com.backend.cartapp.backendcartapp.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backend.cartapp.backendcartapp.model.Product;


public interface CartAppRepository extends CrudRepository<Product, Long> {

	
	
}
