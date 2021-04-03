package com.rest.RestAPI.web.VO;

public class Emp {

	private Integer eno;
	private String name;
	private String hp;
	private String email;
	private Integer depno;
	
	public Emp() {
		eno = 0;
		name ="";
		hp ="";
		email="";
		depno=0;
	}
	
	
	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getDepno() {
		return depno;
	}
	public void setDepno(Integer depno) {
		this.depno = depno;
	}

}
