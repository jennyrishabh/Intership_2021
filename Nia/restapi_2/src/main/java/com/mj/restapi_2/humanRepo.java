package com.mj.restapi_2;

import java.util.ArrayList;
import java.util.List;



/*
 * 
 * All the DB (SQL,ongoDB)related work will be done here 
 * 
 * Author : jennyRishabh
 */

public class humanRepo {
	
	List<human> hu;
	
	
	public humanRepo(){
		hu = new ArrayList<>();
		
		human a1 = new human("prashant" , 21);
		human a2 = new human("ravi" , 22);
		
		hu.add(a1);
		hu.add(a2);
		
		
	}
	
	// for all the humans objects ..
	public List<human> gethumans(){
		return hu;
	}
	
	//for searching the specifed object of the human..
	public human gethuman(String name) {
		
			for(human h : hu) {
				
				if(h.getName().equals(name)) {return h;}
				
			}
			
		
		// if we do not fnd the requested object of the human then return new human()..
		return new human("", 0);
		
	}

	public void create(human h) {
		
		hu.add(h);
		System.out.println("in this list :" +hu.toString());
		
	}

}
