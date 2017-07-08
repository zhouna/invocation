package com.zz.service.impl;

import com.zz.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public String getName() {
		System.out.println("-----getName-----");
		return "zz";
	}

	@Override
	public void setName(String name) {
		System.out.println("-----setName: " + name + "----");
	}

}
