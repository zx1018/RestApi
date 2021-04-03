package com.rest.RestAPI.web.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.RestAPI.web.VO.Emp;
import com.rest.RestAPI.web.mapper.RestMapper;
import com.rest.RestAPI.web.service.RestService;

@Service("RestService")
public class RestServiceImpl implements RestService  {

	@Autowired 
	public RestMapper mapper;

	@Override
	public int insertEmp(Emp vo) throws Exception {
		
		return mapper.insertEmp(vo);
	}

	@Override
	public List<Emp> selectEmp() throws Exception {
		
		return mapper.selectEmp();
	}

	@Override
	public int updateEmp(Emp vo) throws Exception {
		
		return mapper.updateEmp(vo);
	}

	@Override
	public int deleteEmp(Emp vo) throws Exception {
		return mapper.deleteEmp(vo);
	}

	@Override
	public List<Map<String,String>> selectEmpBelongstoEmp(Emp vo) throws Exception {
		return mapper.selectEmpBelongstoEmp(vo);
	}

}

