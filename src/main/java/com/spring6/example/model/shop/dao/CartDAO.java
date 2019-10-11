package com.spring6.example.model.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.spring6.example.model.shop.dto.CartDTO;

@Repository
public interface CartDAO {

	/*장바구니 금액 계산*/
	public List<CartDTO> cartMoney();
	
	/*장바구니 추가*/
	@Insert("insert into cart(cart_id,userid,product_id,amount)"
			+ " values(cart_seq.nextval, #{userid}, #{product_id}, #{amount})")
	public void insert(CartDTO dto);
	
	/*장바구니 목록*/
	@Select("select cart_id, m.userid, m.name, price"
			+ ", p.product_id, product_name, amount"
			+ ", price*amount money"
			+ " from member m, cart c, product p"
			+ " where m.userid=c.userid and p.product_id=c.product_id"
			+ " and m.userid=#{userid}")
	public List<CartDTO> listCart(String userid);
	
	/*장바구니 삭제*/
	@Delete("delete from cart where cart_id=#{cart_id}")
	public void delete(int cart_id);
	
	/*장바구니 전체삭제*/
	public void deleteAll(String userid);
	
	/*장바구니 수정*/
	public void update(int cart_id);
	
	/*장바구니 총 금액*/
	@Select("select nvl(sum(price*amount),0) money"
			+ " from product p, cart c"
			+ " where p.product_id = c.product_id"
			+ " and userid=#{userid}")
	public int sumMoney(String userid);
	
	/*장바구니 담김 여부 확인*/ 
	public int countCart(String userid, int product_id);
	
	/*장바구니 수량 변경*/
	public void updateCart(CartDTO dto);
	public void modifyCart(CartDTO dto);
}
