package com.spring6.example.controller.shop;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring6.example.model.shop.dto.CartDTO;
import com.spring6.example.service.shop.CartService;

@Controller
@RequestMapping("shop/cart/*")
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@RequestMapping("list.do")
	public String cartList(HttpSession session, Model model) {
		String userid = (String) session.getAttribute("userid");
		if(userid !=null) {
			List<CartDTO> list = cartService.listCart(userid);			
			model.addAttribute("list", list);
			model.addAttribute("count", list.size());
			
			int sumMoney = cartService.sumMoney(userid);
			int fee = sumMoney >= 30000 ? 0 : 2500;
			int sum = sumMoney+fee;
			
			model.addAttribute("sumMoney", sumMoney);
			model.addAttribute("fee", fee);
			model.addAttribute("sum", sum);
			return "shop/cart_list";
		}else {
			return "member/login";
		}
	}
	
	@RequestMapping(value="insert.do", method=RequestMethod.POST)	
	public String insert(HttpSession session, CartDTO dto) {
		String userid = (String) session.getAttribute("userid");
		if(userid==null) {
			return "redirect:/member/login.do";
		}
		dto.setUserid(userid);
		cartService.insert(dto);
		return "redirect:/shop/cart/list.do";
	}
	
	@RequestMapping("delete/{cart_id}")
	public String delete(@PathVariable("cart_id") int cart_id) {
		cartService.delete(cart_id);		
		return "redirect:/shop/cart/list.do";
	}
}
