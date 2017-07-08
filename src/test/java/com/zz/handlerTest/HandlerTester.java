package com.zz.handlerTest;

import org.junit.Test;

import com.zz.proxy.MyProxy;
import com.zz.service.ProductService;
import com.zz.service.UserService;
import com.zz.service.impl.ProductServiceImpl;
import com.zz.service.impl.UserServiceImpl;

public class HandlerTester {

	@Test
	public void testInvocation() {
		UserService userService = new UserServiceImpl();
		UserService us = (UserService) MyProxy.getProxyInstance(userService);
		us.getName();
		
		System.out.println();
		
		ProductService productService = new ProductServiceImpl();
		ProductService ps = (ProductService) MyProxy.getProxyInstance(productService);
		Integer count = ps.getCount();
		System.out.println("count: " + count);
	}
}
