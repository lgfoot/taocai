package com.taocai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taocai.service.UserServiceInter;


@Controller("userController")
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserServiceInter userServiceInter;
	
	@RequestMapping("findall.do")
	@ResponseBody
	public List<Map<String,Object>> findAll(){
		List<Map<String,Object>> list = userServiceInter.findAll();
		return list;
	}
}
