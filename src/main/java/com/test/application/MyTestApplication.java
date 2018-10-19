package com.test.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
  * @ClassName: MyTestApplication 
  * @Description: TODO
  * @author chenshangbing
  * @date 2018年9月30日 下午4:33:24 
  * @EnableAutoConfiguration 只扫面当前类
  * @RestController 以json格式返回数据
 */

@RestController
@ComponentScan(basePackages="com.test.controller,com.test.service")
@EnableAutoConfiguration
public class MyTestApplication {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		SpringApplication.run(MyTestApplication.class, args);
	}
}
