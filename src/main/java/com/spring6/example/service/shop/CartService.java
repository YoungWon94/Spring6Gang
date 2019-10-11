package com.spring6.example.service.shop;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.spring6.example.model.shop.dto.CartDTO;


public interface CartService {
	/*장바구니 금액 계산*/
	public List<CartDTO> cartMoney();
	
	/*장바구니 추가*/
	public void insert(CartDTO dto);
	
	/*장바구니 목록*/	
	public List<CartDTO> listCart(String userid);
	
	/*장바구니 삭제*/
	public void delete(int cart_id);
	
	/*장바구니 전체삭제*/
	public void deleteAll(String userid);
	
	/*장바구니 수정*/
	public void update(int cart_id);
	
	/*장바구니 총 금액*/
	public int sumMoney(String userid);
	
	/*장바구니 담김 여부 확인*/
	public int countCart(String userid, int product_id);
	
	/*장바구니 수량 변경*/
	public void updateCart(CartDTO dto);
	public void modifyCart(CartDTO dto);
}
