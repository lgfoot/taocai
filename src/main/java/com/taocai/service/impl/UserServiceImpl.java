package com.taocai.service.impl;

import java.util.List;

import javax.xml.ws.ServiceMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taocai.dao.UserDao;
import com.taocai.service.UserServiceInter;

@Service("userServiceImpl")
public class UserServiceImpl implements UserServiceInter {
	
	@Autowired
	UserDao userDao;
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
