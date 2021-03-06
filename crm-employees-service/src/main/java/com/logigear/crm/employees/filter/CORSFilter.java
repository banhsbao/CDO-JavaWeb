package com.logigear.crm.employees.filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORSFilter implements WebMvcConfigurer {

    private static final long MAX_AGE_SECS = 3600;
    private static final String[] HTTP_METHODS_ALLOWED = {"HEAD", "OPTIONS", "GET",
            "POST", "PUT", "PATCH", "DELETE", "UPDATE"};

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods(HTTP_METHODS_ALLOWED)
                .allowedHeaders("*")
                .maxAge(MAX_AGE_SECS);
    }

}
