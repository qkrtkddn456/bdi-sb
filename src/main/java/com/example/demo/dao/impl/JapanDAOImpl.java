package com.example.demo.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.JapanDAO;

@Repository
public class JapanDAOImpl implements JapanDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Map<String, Object>> selectJPList() {
		
		return ss.selectList("com.example.demo.JAPAN.selectJapan");
	}

	@Override
	public int insertJP(Map<String, String> jp) {
		
		return ss.insert("com.example.demo.JAPAN.insertJapan",jp);
	}

	@Override
	public int updateJP(Map<String, String> jp) {
		
		return ss.update("com.example.demo.JAPAN.updateJapan",jp);
	}

	@Override
	public int deleteJP(int jpnum) {
		
		return ss.delete("com.example.demo.JAPAN.deleteJapan",jpnum);
	}

}
