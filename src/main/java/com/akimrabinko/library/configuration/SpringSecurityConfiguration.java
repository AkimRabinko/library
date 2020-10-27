package com.akimrabinko.library.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {
    private static final String[] ALLOWED_PATTERNS = new String[]{"/**"};

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(ALLOWED_PATTERNS).permitAll()
                .anyRequest().authenticated()
                .and()
                .headers()
                .frameOptions()
                .sameOrigin()
                .and()
                .csrf()
                .disable();
    }


}
