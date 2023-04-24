package com.sakila.api.filters;

import java.io.IOException;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.ext.Provider;

// @Provider
// public class NotFoundFilter implements ContainerResponseFilter{

//     @Override
//     public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
//         if (responseContext.getStatus() == 404) {
//             String errorMessage = "The requested resource was not found";
//             responseContext.setEntity(errorMessage);
//         }
//     }
// }
