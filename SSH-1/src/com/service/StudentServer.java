package com.service;

import java.util.List;

import com.dao.StudentDao;
import com.entities.Student;

public class StudentServer {
	
	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		System.out.println(studentDao);
		this.studentDao = studentDao;
	}
	public List<Student> select(int id) {
		return studentDao.select(id);
	}
	public List<Student> select(String name) {
		return studentDao.select(name);
	}
}
