package com.example.urldemo.rest;

import java.net.MalformedURLException;
import java.net.URL;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/url")
public class CustomUrl {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		String response = "custom url resolved!";

		try {
			new URL("custom:exmaple.txt");
		} catch (MalformedURLException e) {
			response = e.getLocalizedMessage();
		}
		return Response.ok(response).build();
	}

}
