package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.JapanService;

@RestController
public class JapanController {

	@Autowired
	private JapanService js;
	
	@GetMapping(value="/jp")
	public @ResponseBody List<Map<String,Object>> selectJPList() {
		return js.selectJPList();
	}
	@PostMapping(value="/jp")
	public @ResponseBody int insertJP(@RequestBody Map<String,String> jp) {
		return js.insertJP(jp);
	}
	@PutMapping(value="/jp")
	public @ResponseBody int updateJP(@RequestBody Map<String,String> jp) {
		return js.updateJP(jp);
	}
	@DeleteMapping(value="/jp/{jpnum}")
	public @ResponseBody int deleteJP(@PathVariable int jpnum) {
		return js.deleteJP(jpnum);
	}
	
}
