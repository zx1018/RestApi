package com.rest.RestAPI.web.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.rest.RestAPI.web.VO.Emp;
import com.rest.RestAPI.web.service.RestService;

import ch.qos.logback.classic.Logger;
 

@Controller
@RestController
public class RestSampleController {
	
	private static Logger log = (Logger) LoggerFactory.getLogger(RestSampleController.class);
	
	@Autowired(required=true)
    private RestService service;
	
	@RequestMapping(value="/insa/emp/{eno}" , produces="application/json", method=RequestMethod.GET)
	public String methodGet() throws Exception {
		log.info("Select");
		
		return new Gson().toJson(service.selectEmp());
	}
	
	@RequestMapping(value="/insa/emp/{eno}" , produces="application/json", method=RequestMethod.POST)
	public int methodPost(Emp vo) throws Exception {
		
		log.info("Insert");
		int result = service.insertEmp(vo);
		return result ;
	}
	
	@RequestMapping(value="/insa/emp/{eno}" , produces="application/json", method=RequestMethod.DELETE)
	public int methodDelete(Emp vo) throws Exception {
		
		log.info("Delete");
		int result = service.deleteEmp(vo);
		return result ;
	}
	
	@RequestMapping(value="/insa/emp/{eno}" , produces="application/json", method=RequestMethod.PUT)
	public int methodUpdate(Emp vo) throws Exception {
		
		log.info("Update");
		int result = service.updateEmp(vo);
		return result ;
	}
	
	@RequestMapping(value="/insa/emp/{eno}/belongsto/dep" , produces="application/json", method=RequestMethod.GET)
	public String methodGetDep(Emp vo) throws Exception {
		log.info("SelectDep");
		return new Gson().toJson(service.selectEmpBelongstoEmp(vo));
	}
	
	
	
	//최초 진입 페이지 
	@RequestMapping("/")
    public ModelAndView selectTranData() throws Exception{
    	
    	ModelAndView mav = new ModelAndView("demo");
    	
    	log.info("데모 페이지 진입");
   	
		return mav;    
    } 
	
}

