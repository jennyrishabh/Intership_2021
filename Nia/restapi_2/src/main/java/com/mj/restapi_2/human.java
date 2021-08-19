package com.mj.restapi_2;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonRootName;



/*
* this is the base class for the extraction of the attributres from the sql and store it in this class variables..
*
* Author : jennyRishabh
*/

@JsonRootName(value="human")
public class human {
	
	public human(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	
	
    public human() {
    }
	
	
	private String name;
	private int age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "human [name=" + name + ", age=" + age + "]";
	}

}
