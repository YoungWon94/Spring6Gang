package com.spring6.example.controller.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring6.example.model.product.dto.ProductDTO;
import com.spring6.example.service.product.ProductService;

@Controller
@RequestMapping("shop/product/*")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping("list.do")
	public String list(Model model) {
		List<ProductDTO> list = productService.listProduct();
		model.addAttribute("list", list);
		return "shop/product_list";
	}
	
	@RequestMapping("view/{product_id}")
	public String view(@PathVariable("product_id") String product_id, Model model) {
		ProductDTO dto= productService.viewProduct(product_id);
		model.addAttribute("dto", dto);
		return "shop/product_view";
	}
}
