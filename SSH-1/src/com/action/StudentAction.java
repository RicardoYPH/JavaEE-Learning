package com.action;

import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;

import com.dao.StudentDao;
import com.entities.Student;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport implements RequestAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private StudentDao studentDao;
	private Map<String, Object> request;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String select() {
		List<Student> ls = studentDao.select(id);
		request.put("ls", ls);
		return SUCCESS;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.request = arg0;
	}

}
