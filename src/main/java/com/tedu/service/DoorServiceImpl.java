package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;
@Service//1.标识当前类属于Service层
/*2.将当前类的对象的创建交给Spring容器
 * 最后该对象会赋值给带有同类型的且带有@autoWired注解的变量*/
public class DoorServiceImpl implements DoorService{
	@Autowired
	DoorMapper dao;
	@Override
	public List<Door> findAll() {
		//调用dao层的方法,查询所有门店
		List<Door> list = dao.findAll();
		return list;
	}
	@Override
	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

	@Override
	public void addDoor(Door door) {
		dao.addDoor(door);
		
	}
	@Override
	public Door findById(Integer id) {
		Door door = dao.findById(id);
		return door;
		
	}
	/*@Override*/
	/*public void updateById(Door door) {
		dao.updateById(door);
		
	}*/
	

}
