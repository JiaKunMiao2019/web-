package com.tedu.pojo;
/*门店实体类用于封装门店信息*/
public class Door {
	private String name;
	private String addr;
	private Integer id;
	private String tel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Door(String name, String addr, String tel) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Door(String name, String addr, Integer id, String tel) {
		super();
		this.name = name;
		this.addr = addr;
		this.id = id;
		this.tel = tel;
	}
	public Door() {
		super();
	}
	@Override
	public String toString() {
		return "Door [id=" + id + ",name=" + name + ",tel=" + tel  + ",addr=" + addr +"]";
	}
	
}
