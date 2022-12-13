package com.example.registration.util;

import org.apache.http.HttpResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(1)
public class AppCorsFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse)  response;
        httpResponse.addHeader("Access-Control-Request-Headers","*");
        httpResponse.addHeader("Access-Control-Allow-Methods","*");
        httpResponse.addHeader("Access-Control-Allow-Origin","*");
        chain.doFilter(request,response);

    }
}
