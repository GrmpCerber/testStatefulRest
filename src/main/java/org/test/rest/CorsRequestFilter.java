package org.test.rest;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
@PreMatching
public class CorsRequestFilter implements ContainerRequestFilter {
	public CorsRequestFilter() {
		System.out.println("CorsRequestFilter.init");
	}
	@Override
	public void filter(ContainerRequestContext req)
			throws IOException {
		System.out.println("CorsRequestFilter.filter");
		if ("OPTION".equals(req.getMethod())) {
			req.abortWith(Response.ok().build());
		}
	}

}
