package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDao {
	private SessionFactory sf;

	public void setSf(SessionFactory sf) {
//		System.out.println(sf);
		this.sf = sf;
	}
	public Session getSession() {
		return this.sf.getCurrentSession();
	}
}
