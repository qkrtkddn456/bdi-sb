package com.example.demo.service;

import java.util.List;
import java.util.Map;

public interface JapanService {

	public List<Map<String,Object>> selectJPList();
	public int insertJP(Map<String,String> jp);
	public int updateJP(Map<String,String> jp);
	public int deleteJP(int jpnum);
}
