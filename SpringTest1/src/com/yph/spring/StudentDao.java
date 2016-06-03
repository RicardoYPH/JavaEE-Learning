package com.yph.spring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


public class StudentDao {

    private JdbcTemplate jdbcT;
    public JdbcTemplate getJdbcT() {
		return jdbcT;
	}
	public void setJdbcT(JdbcTemplate jdbcT) {
		this.jdbcT = jdbcT;
	}
	public List findALL() {
        String sql = "select * from student";
        return jdbcT.queryForList(sql);        
    }
	public List findStu(int i) {
		String sql = "select * from student where sid = " + String.valueOf(i);
		return jdbcT.queryForList(sql);
	}

   
}