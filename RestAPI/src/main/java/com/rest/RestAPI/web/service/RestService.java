package com.rest.RestAPI.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rest.RestAPI.web.VO.Emp;

@Service
public interface RestService {

	public int insertEmp(Emp vo) throws Exception;
	
	public List<Emp> selectEmp() throws Exception;
	
	public int updateEmp(Emp vo) throws Exception;
	
	public int deleteEmp(Emp vo) throws Exception;

	public List<Map<String,String>> selectEmpBelongstoEmp(Emp vo) throws Exception;

}

