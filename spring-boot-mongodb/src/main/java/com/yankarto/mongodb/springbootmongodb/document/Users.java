package com.yankarto.mongodb.springbootmongodb.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Users {
	@Id
private Integer id;
private String name;
private String teamname;
private String specialization;
private Long salary;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTeamname() {
	return teamname;
}
public void setTeamname(String teamname) {
	this.teamname = teamname;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public Long getSalary() {
	return salary;
}
public void setSalary(Long salary) {
	this.salary = salary;
}
public Users(Integer id, String name, String teamname, String specialization, Long salary) {
	super();
	this.id = id;
	this.name = name;
	this.teamname = teamname;
	this.specialization = specialization;
	this.salary = salary;
}


}
