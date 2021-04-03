package com.rest.RestAPI.web.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.rest.RestAPI.web.VO.Emp;


@Repository 
@Mapper 
public interface RestMapper {
	
	public int insertEmp(Emp vo) throws Exception;
	
	public List<Emp> selectEmp() throws Exception;
	
	public int updateEmp(Emp vo) throws Exception;
	
	public int deleteEmp(Emp vo) throws Exception;

	public List<Map<String,String>> selectEmpBelongstoEmp(Emp vo) throws Exception;
}

