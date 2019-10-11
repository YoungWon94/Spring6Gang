package com.spring6.example.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring6.example.model.product.dao.ProductDAO;
import com.spring6.example.model.product.dto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDao;
	
	@Override
	public List<ProductDTO> listProduct() {
		return productDao.listProduct();
		
	}
	@Override
	public ProductDTO viewProduct(String product_id) {
		return productDao.viewProduct(product_id);
	}

}
