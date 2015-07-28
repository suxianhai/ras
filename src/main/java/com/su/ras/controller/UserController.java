package com.su.ras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.su.ras.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@SuppressWarnings({ "unused", "rawtypes" })
	@RequestMapping(value = "/index")
	public String index(){
		try {
			System.out.println("start");
			PageInfo pageInfo = userService.findList(null, 1, 20);
			//User user = userService.selectByPrimaryKey(1);
			System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
}
