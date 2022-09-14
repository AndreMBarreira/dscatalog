package com.devsuperior.dscatalog.tests;

import java.time.Instant;

import com.devsuperior.dscatalog.dto.ProductDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;

public class Factory {

	public static Product creatProduct() {
		Product product = new Product(1L, "Phone", "Good Phone", 800.0, "https://img.com/img.png",
				Instant.parse("2020-07-13T20:50:07.12345Z"));
		product.getCategories().add(new Category(2L, "Electronics"));
		return product;
	}

	public static ProductDTO creatProductDTO() {
		Product product = creatProduct();
		return new ProductDTO(product, product.getCategories());
	}

	public static Category creatCategory() {

		return new Category(1L, "Electronics");
	}

}
