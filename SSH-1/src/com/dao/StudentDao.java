package com.dao;

import java.util.List;

import org.hibernate.Query;

import com.entities.Student;

public class StudentDao extends BaseDao {
	
	public List<Student> select(int id) {
		String hql = "FROM Student s where s.sid = ?";
		Query query = getSession().createQuery(hql);
		query.setInteger(0, id);
		return query.list();
	}
	public List<Student> select(String name) {
		String hql = "FROM Student s where s.sname = ?";
		Query query = getSession().createQuery(hql).setString(0, name);
		return query.list();
	}
	public void saveOrUpdate(Student s) {
		getSession().saveOrUpdate(s);
	}
	
	
}
