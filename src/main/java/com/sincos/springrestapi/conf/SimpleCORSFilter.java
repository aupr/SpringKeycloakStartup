//package com.sincos.springrestapi.conf;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//@Order(Ordered.HIGHEST_PRECEDENCE)
//public class SimpleCORSFilter implements Filter {
//
//    private final Logger log = LoggerFactory.getLogger(SimpleCORSFilter.class);
//
//    public SimpleCORSFilter() {
//        log.info("SimpleCORSFilter init");
//    }
//
//    @Override
//    public void init(FilterConfig filterConfig) {}
//
//    @Override
//    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
//
//        HttpServletRequest request = (HttpServletRequest) req;
//        HttpServletResponse response = (HttpServletResponse) res;
//
//        //response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
//        response.setHeader("Access-Control-Allow-Origin", "*");
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//        response.setHeader("Access-Control-Allow-Methods", "GET, POST, POST, DELETE");
//        response.setHeader("Access-Control-Max-Age", "3600");
//        response.setHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, X-Requested-With, remember-me");
//
//
//
//        chain.doFilter(req, res);
//        System.out.println("___________________________________________________________________________________________");
//        System.out.println("___________________________________________________________________________________________");
//        System.out.println("___________________________________________________________________________________________");
//        System.out.println("___________________________________________________________________________________________");
//        System.out.println("___________________________________________________________________________________________");
//        System.out.println("___________________________________________________________________________________________");
//        System.out.println("___________________________________________________________________________________________");
//        System.out.println("___________________________________________________________________________________________");
//        System.out.println("___________________________________________________________________________________________");
//        System.out.println("___________________________________________________________________________________________");
//
////        if("OPTIONS".equalsIgnoreCase(request.getMethod())) {
////            response.setStatus(HttpServletResponse.SC_OK);
////        } else {
////            chain.doFilter(req, res);
////        }
//    }
//
//    @Override
//    public void destroy() {}
//}
