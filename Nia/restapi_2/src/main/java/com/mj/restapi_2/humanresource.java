package com.mj.restapi_2;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


/*
 * 
 * All the path redirecting work will be done here 
 * 
 * Author : jennyRishabh
 */


@Path("/humanresource")
public class humanresource {
	
	humanRepo huREPO = new humanRepo();
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public human gethuman() {
		System.out.println("get humans() called here in the human_REsource..");
		return new human("rishbah" ,19);
	}  
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<human> gethumaninjson() {
		System.out.println("get humans() JSON  .");
		//return new human("jain" ,22);
		return huREPO.gethumans();
	}  
	
	
	@POST
	@Path("/createHuman")
	@Produces(MediaType.APPLICATION_JSON)
	public human createhuman(human h) {
		System.out.println("in here in the created function : "+h);
		
		huREPO.create(h);
		return h;
	}
	
	
	@GET
	@Path("human/{newtemp}")
	@Produces(MediaType.APPLICATION_JSON)
	public human gethumanwithid(@PathParam("newtemp") String name) {
		System.out.println("called .. seaching the requested object in the Db...");
		return huREPO.gethuman(name);
	}
	
	

}
