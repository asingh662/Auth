package com.cerner.Auth;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("verify")
public class UserAuth {
	
	 
	    
		@GET
		@Path("user")
		@Produces(MediaType.TEXT_PLAIN)
		public String validUser() {
			return "you are a valid user";
		}

}
