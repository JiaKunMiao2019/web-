package com.tedu.dao;

import java.util.List;

import com.tedu.pojo.Door;
/*Dao接口*/
public interface DoorMapper {
	/*1.查询所有门店信息*/
	public List<Door> findAll();
	/*2.根据id删除门店*/
	public void deleteById(Integer id);
	/*3.新增门店*/
	public void addDoor(Door door);
	/*3.新增门店*/
	public Door findById(Integer id);
	/*public void updateById(Door door);
	*/
	
}
