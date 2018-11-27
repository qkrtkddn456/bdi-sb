package com.example.demo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.JapanDAO;
import com.example.demo.service.JapanService;

@Service
public class JapanServiceImpl implements JapanService {

	@Autowired
	private JapanDAO jdao;
	@Override
	public List<Map<String, Object>> selectJPList() {
		
		return jdao.selectJPList();
	}

	@Override
	public int insertJP(Map<String, String> jp) {
		
		return jdao.insertJP(jp);
	}

	@Override
	public int updateJP(Map<String, String> jp) {
		
		return jdao.updateJP(jp);
	}

	@Override
	public int deleteJP(int jpnum) {
		
		return jdao.deleteJP(jpnum);
	}

}
