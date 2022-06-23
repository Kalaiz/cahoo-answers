package com.kalaiz.cahoo_backend;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
			auth
		    .inMemoryAuthentication()
	          .withUser("user")
	          .password("password")
	          .roles("USER");
    }

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
    	http.csrf().disable().authorizeRequests()
    	.anyRequest().authenticated().and().formLogin();
    	
    }
    
}
