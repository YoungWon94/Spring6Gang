package com.spring6.example.service.product;

import java.util.List;

import com.spring6.example.model.product.dto.ProductDTO;

public interface ProductService {
	
	public List<ProductDTO> listProduct();
	public ProductDTO viewProduct(String product_id);
}
