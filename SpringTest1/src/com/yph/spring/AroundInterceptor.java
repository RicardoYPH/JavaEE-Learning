package com.yph.spring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundInterceptor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before" + invocation.getMethod().getName());
		
		Object returnAround = invocation.proceed();
		System.out.println("After" + invocation.getMethod().getName());
		
		return returnAround;
	}

}
