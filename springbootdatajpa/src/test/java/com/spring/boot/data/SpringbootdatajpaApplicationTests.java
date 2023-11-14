package com.spring.boot.data;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.spring.boot.data.entities.Product;
import com.spring.boot.data.repos.ProductRepository;

@SpringBootTest
class SpringbootdatajpaApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Autowired
	ApplicationContext ctx;
	
//	@Test
//	void saveProduct() {
//		ProductRepository repository = ctx.getBean(ProductRepository.class);
		// insert 문
//		Product product = new Product();
//		product.setId(6);
//		product.setName("상6");
//		product.setDescription("상6");
//		product.setPrice(5000);
//		
//		repository.save(product);
		
		//select문
//		Product product = null;
//		product = repository.findById(1).orElseThrow(EntityNotFoundException::new);
//		System.out.println(product);
		
		// update 문 = 가져와서 set하고 save해주면 update가 됨.
//		Product product = null;
//		product = repository.findById(1).orElseThrow(EntityNotFoundException::new);
//		
//		product.setPrice(3500);
//		repository.save(product);
		
		// 전체 조회
//		List<Product> pList = (List<Product>)repository.findAll();
//		for(Product pro: pList) {
//			System.out.println(pro);
//		}

		// delete 문
//		repository.deleteById(2);
		
//	}
		
		@Test
		void customJpaProduct() {
			ProductRepository repository = ctx.getBean(ProductRepository.class);

			List<Product> proList = repository.findByName("상5");
			for(Product product3 : proList) {
				System.out.println(product3);
			}
			
			List<Product> proList2 = repository.findByNameAndPrice("상5", 3500);
			for(Product product4 : proList2) {
				System.out.println(product4);
			}
		}
}