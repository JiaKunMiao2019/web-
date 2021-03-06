package com.tedu.dao;

import java.util.List;

import org.springframework.ui.Model;

import com.tedu.pojo.Order;

/**
 * Dao层接口
 * @author UID
 *
 */
public interface OrderMapper {

	List<Order> findAll();

	void deleteById(Integer id);

	void addOrder(Order order);

	Order selectById(Integer id);

	void updateById(Order order);

}
