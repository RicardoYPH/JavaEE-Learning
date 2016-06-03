package com.yph.spring;

import java.util.Iterator;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyTest {

	@Ignore
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Student s = (Student) ctx.getBean("student");
		System.out.println(s);
		
	}
	
	@Ignore
	public void test2() {
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new AroundInterceptor());
		pf.setTarget(new Student());
		Student stu = (Student)pf.getProxy();
		stu.toString();
	}
	@Ignore
	public void test3() {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:/bean.xml");
		Student stu = (Student)ctx.getBean("proxyfactory");
		stu.toString();
	}
	
	@Test
	public void test4() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		StudentDao std = (StudentDao)ctx.getBean("studentDao");
		List<Student>li = std.findStu(100);
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		
	} 

}
