package com.spring6.example.service.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring6.example.model.shop.dao.CartDAO;
import com.spring6.example.model.shop.dto.CartDTO;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	CartDAO cartDao;

	@Override
	public List<CartDTO> cartMoney() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(CartDTO dto) {
		cartDao.insert(dto);
		
	}

	@Override
	public List<CartDTO> listCart(String userid) {
		return cartDao.listCart(userid);
	}

	@Override
	public void delete(int cart_id) {
		cartDao.delete(cart_id);
		
	}

	@Override
	public void deleteAll(String userid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int cart_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sumMoney(String userid) {
		// TODO Auto-generated method stub
		return cartDao.sumMoney(userid);
	}

	@Override
	public int countCart(String userid, int product_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateCart(CartDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyCart(CartDTO dto) {
		// TODO Auto-generated method stub
		
	}

}
