package com.lowes.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class HostFilter implements Filter {
    private static final Logger log = LoggerFactory.getLogger(ProductInterceptor.class);
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("Remote Host : "+servletRequest.getRemoteHost());
        log.info("Remote Address : "+servletRequest.getRemoteAddr());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
