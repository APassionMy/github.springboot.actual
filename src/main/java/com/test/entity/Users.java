package com.test.entity;

import java.io.Serializable;

/**
 * 实体类
  * @ClassName: Users 
  * @Description: TODO
  * @author chenshangbing 
  * @date 2018年9月13日 下午4:18:59 
  * @Serializable 对实体进行序列化，才可以添加到数据库中
 */
public class Users implements Serializable{

	private int id;
	private String usename;
	private int age;
	private String birthday;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", usename=" + usename + ", age=" + age + ", birthday=" + birthday + "]";
	}
}
