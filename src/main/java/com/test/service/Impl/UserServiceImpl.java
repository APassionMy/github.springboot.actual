package com.test.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.test.entity.Users;
import com.test.service.UserService;

/**
 * jdbcTemplate.update用于修改与添加
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @author chenshangbing
 * @date 2018年9月30日 下午4:14:09
 * @Repository 表示Spring把创建好的save注入给Service
 */
@Repository
public class UserServiceImpl implements UserService {

	@Autowired
	JdbcTemplate jdbcTemplate; // 这里相当于初始化JdbcTemplate对象

	public void save(Users users) {
		//添加sql语句
		String sql = "insert into users(Id,usename,age,birthday)values(?,?,?,?)";
		//调用方法
		jdbcTemplate.update(sql, users.getId(), users.getUsename(), users.getAge(), users.getBirthday());
		

	}
	//查询
	public List<Map<String, Object>> queryList() {
		String sql2="select * from users";
		List<Map<String, Object>> list=jdbcTemplate.queryForList(sql2);
		return list;
	}
}
