package com.maybank.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
public class LoggingConfig {

    
    @Bean
    public CommonsRequestLoggingFilter requestLoggingFilter() {
        CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
        loggingFilter.setIncludeClientInfo(true); // Logs client details like IP
        loggingFilter.setIncludeQueryString(true); // Logs query parameters
        loggingFilter.setIncludeHeaders(true); // Logs request headers
        loggingFilter.setIncludePayload(true); // Logs request body
        loggingFilter.setMaxPayloadLength(10000); // Maximum size of logged request body
        return loggingFilter;
    }
}

