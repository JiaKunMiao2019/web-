package com.tedu.service;

import java.util.List;

import com.tedu.pojo.Door;
/*Service 接口*/
public interface DoorService {
		/*1.查询所有门店信息*/
	public List<Door> findAll();
	/*2.根据id删除门店*/
	public void deleteById(Integer id);
	/*3.新增门店*/
	public void addDoor(Door door);
	/*4.根据ID查询门店信息*/
	public Door findById(Integer id);
	/*5.根据ID修改门店信息
	public void updateById(Door door);*/
	
}
