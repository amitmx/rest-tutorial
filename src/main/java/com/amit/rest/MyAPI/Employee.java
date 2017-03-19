/**
 * 
 */
package com.amit.rest.MyAPI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author ibm_admin
 *
 */
@Path("message")
public class Employee 
{
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String displayMessage()
	{
		return "Hello World this is my first page";
	}
}
