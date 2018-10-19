package com.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.entity.Users;
import com.test.service.UserService;

/**
 * 
 * @ClassName: UserController
 * @Description: TODO
 * @author chenshangbing
 * @date 2018年10月11日 下午5:25:14
 *
 */

@Controller
public class UserController {

	@Autowired
	UserService userService; // service层接口

	@RequestMapping("/userTest")
	public Map<String, Object> userTest() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userName", "admin");
		map.put("passWord", "123456");
		return map;
	}

	@RequestMapping("/addUser")
	public Map<String, Object> addUser() throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		// 初始化对象
		Users users = new Users();
		// 给对象赋值
		users.setId(04);
		users.setUsename("admin");
		users.setAge(19);
		users.setBirthday("2018-09-30");
		// 调用添加save方法
		userService.save(users);

		map.put("添加成功", true);

		return map;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request) throws Exception {
		List<Map<String, Object>> list = userService.queryList();
		int age = 0;
		for (Map<String, Object> map : list) {
			age = (int) map.get("age");
		}
		request.setAttribute("age", age);

		System.out.println(age);
		return "login";
	}

	@RequestMapping("/auerList")
	public ModelAndView auerList(ModelAndView andView,HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setContentType("text/html;charset=UTF-8;pageEncoding=UTF-8");// 设置编码格式
		request.setCharacterEncoding("UTF-8");// 设置请求的编码格式
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		if(!"admin".equals(name)) {
			request.setAttribute("errorName", "**用户名错误！");
			andView.setViewName("login");
		}else if(!"12345".equals(password)) {
			request.setAttribute("errorPasword", "**密码错误！");
			andView.setViewName("login");
		}else if("admin".equals(name) && "12345".equals(password)){
			andView.setViewName("tree/index");
		}
		return andView;
	}
}
