package com.spring6.example.model.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.spring6.example.model.product.dto.ProductDTO;

@Repository
public interface ProductDAO {

	@Select("select * from product")
	public List<ProductDTO> listProduct();
	
	@Select("select * from product where product_id=#{product_id}")
	public ProductDTO viewProduct(String product_id);
}
