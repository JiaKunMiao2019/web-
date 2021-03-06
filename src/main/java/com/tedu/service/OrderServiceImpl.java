package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.tedu.dao.OrderMapper;
import com.tedu.pojo.Order;
@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderMapper dao;
	
	@Override
	public List<Order> findAll() {
		 List<Order> list = dao.findAll();
			return list;
	}

	@Override
	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

	@Override
	public void addOrder(Order order) {
		dao.addOrder(order);
	}

	@Override
	public Order selectById(Integer id) {
		Order order = dao.selectById(id);
		return order;
	}

	@Override
	public void updateById(Order order) {
		dao.updateById(order);
		
	}

	

}
