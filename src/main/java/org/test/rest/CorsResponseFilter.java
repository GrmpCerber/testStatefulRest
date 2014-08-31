package org.test.rest;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;

@Provider
@PreMatching
public class CorsResponseFilter implements ContainerResponseFilter {
	public CorsResponseFilter() {
		System.out.println("CorsResponseFilter.init");
	}

	@Override
	public void filter(ContainerRequestContext req,
			ContainerResponseContext resp) throws IOException {
		System.out.println("CorsResponseFilter.filter");
		resp.getHeaders().add("Access-Control-Allow-Origin", "*");
		resp.getHeaders().add("Access-Control-Allow-Credentials", "true");
		resp.getHeaders().add("Access-Control-Allow-Methods",
				"GET, POST, DELETE, PUT");
		resp.getHeaders().add("Access-Control-Allow-Headers",
				"Content-Type, Accept");
	}

}
