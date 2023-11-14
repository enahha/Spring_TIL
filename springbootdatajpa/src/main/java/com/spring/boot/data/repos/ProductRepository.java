package com.spring.boot.data.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.data.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	
	//jsp 커스텀 쿼리
	List<Product> findByName(String name);
	
	List<Product> findByNameAndPrice(String name, int price);
}
