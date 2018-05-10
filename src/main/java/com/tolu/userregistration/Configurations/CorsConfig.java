package com.tolu.userregistration.Configurations;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CorsConfig implements Filter{

    @Override
    public void init(FilterConfig fc) throws ServletException {}

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub
        System.out.println(req.getRemoteHost());
        HttpServletResponse response = (HttpServletResponse) resp;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with, Content-Type");
        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {}
}
