package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;
import com.tedu.service.DoorService;

/*测试SSM的开发环境*/
@Controller
public class DoorController {
	private static final String Door = null;
	@Autowired//自动装配:将由Spring容器负责创建该对象,并赋值给该变量,每次都只能为一个变量赋值
	DoorMapper doorMapper;
	@Autowired
	DoorService doorService;
	/**1.查询所有门店信息*/
	@RequestMapping("/doorList")//自建访问路径优先等级高于通用优先等级,通用路径等级是最低等级
	public String doorList(Model model){
		//1.调用Service层的方法,查询所有门店
		List<Door> list = doorService.findAll();
		//2.将所有门店的集合存入到model中
		model.addAttribute("list",list);
		//3.转向门店列表页面
		return "door_list";
	}
	/*2.根据id删除门店信息*/
	@RequestMapping("/doorDelete")
	public String doorDelete(Integer id){
		//调用Service的方法,根据id删除门店
		doorService.deleteById(id);
		//转向门店列表页面,显示最新门店信息
		return "forward:/doorList";
	}
	@RequestMapping("/doorAdd")
	public String doorAdd(Door door){
		//调用Service方法,新增门店
		doorService.addDoor(door);
		return "forward:/doorList";
	}
	/*根据id查询门店详情信息*/
	@RequestMapping("/doorInfo")
	public String doorInfo(Model model , Integer id){
		//调用Service方法,根据id查询门店信息
		Door door = doorService.findById(id);
		//将门店信息存到Model中
		model.addAttribute("door",door);
		System.out.println(door);
		//将查询到的门店信息回显到修改页面上
		return "door_update";
	}
	/*根据id修改门店信息*/
	/*@RequestMapping("/doorUpdate")
	public String doorUpdate(Door door){
		//调用Service方法,根据id修改门店信息
		doorService.updateById(door);
		//将门店信息存到Model中
		
		//将查询到的门店信息回显到修改页面上
		return "forward:/doorList";
	}*/
	/*@RequestMapping("/testssm")
	public String testSSM(){
		//查询所有门店信息
		List<Door> list = doorMapper.findAll();
		for (Door door : list) {
			System.out.println(door);
		}
		return "testssm";
	}*/
	/*
	 * 通用的JSp页面跳转方法,
	 * 比如:访问到/WEB-INF/pages/door_add.jsp
	 * 只需要让下面的方法返回"door_add"值
	 * 因为方法返回的值,其实就是路径斜杠后面的值
	 * 因此,在访问时,需要访问/door_add路径*/
	@RequestMapping("/{page}")
	/*在@RequestMapping("/{变量}")中配置变量,(@PathVariable 变量类型  变量)*/
	public String toIndex(@PathVariable String page){
		return page;
	}
}
