package com.zz.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.zz.handler.MyInvocationHandler;

public class MyProxy {
	public static Object getProxyInstance(Object obj) {
		InvocationHandler invocationHandler = new MyInvocationHandler(obj);
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), invocationHandler);
	}
}
