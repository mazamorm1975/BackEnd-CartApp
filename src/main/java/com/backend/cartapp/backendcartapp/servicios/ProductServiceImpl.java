package com.backend.cartapp.backendcartapp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.cartapp.backendcartapp.model.Product;
import com.backend.cartapp.backendcartapp.repositorios.CartAppRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private CartAppRepository repository;
	
	@Override
	@Transactional
	public List<Product> findAll() {
		return (List<Product>) repository.findAll();
	}

}
