package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tedu.pojo.Door;
import com.tedu.pojo.Order;
import com.tedu.service.DoorService;
import com.tedu.service.OrderService;
@Controller
public class OrderController {
	@Autowired 
	OrderService orderService;
	@Autowired 
	DoorService doorService;
	/*1.查询所有订单消息*/
	@RequestMapping("/orderList")
	public String orderList(Model model){
		//查询所有门店集合
		List<Door> doorlist = doorService.findAll();
		//将门店集合存入model中
		model.addAttribute("doorlist",doorlist);
		for (Door door : doorlist) {
			System.out.println(door);
		}
		//查询所有订单集合
		List<Order> orderlist = orderService.findAll();
		//将订单集合存入Model中
		model.addAttribute("orderlist",orderlist);
		//转向order_list.jsp进行显示
		for (Order order : orderlist) {
			System.out.println(order);
		}
		return "order_list";
	}
	@RequestMapping("/orderDelete")
	public String orderDelete(Integer id){
		orderService.deleteById(id);
		return "forward:/orderList";
	}
	/*跳转到新增订单页面,跳转的同时查询出所有门店,将所有门店带到新增订单页面*/
	@RequestMapping("/ToOrderAdd")
	public String ToOrderAdd(Model model){
		//查询所有门店集合
		List<Door> doorlist = doorService.findAll();
		//将门店集合存入model中
		model.addAttribute("dlist",doorlist);
		
		return "order_add";
	}
	@RequestMapping("/orderAdd")
	public String orderAdd(Order order){
		orderService.addOrder(order);
		return "forward:/orderList";//forword重定向将查询的数据值带到orderList页面中遍历
		
	}
	@RequestMapping("/orderInfo")
	public String orderInfo(Model model,Integer id){
		List<Door> door = doorService.findAll();
		model.addAttribute("list",door);
		Order order = orderService.selectById(id);
		model.addAttribute("order",order);
		return "order_update";
	}
	@RequestMapping("/orderUpdate")
	public String updateById(Order order){
		orderService.updateById(order);
		return "forward:/orderList";
	}
}
