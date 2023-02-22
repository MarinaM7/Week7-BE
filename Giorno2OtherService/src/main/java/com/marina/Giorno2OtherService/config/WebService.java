package com.marina.Giorno2OtherService.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebService  extends WebSecurityConfigurerAdapter  {


	@Override
	protected void configure(HttpSecurity http) throws Exception {

	http
		.authorizeRequests()					
			.antMatchers("/", "/os/get-string", "/os/get-people", "/os/get-people-json")
			.permitAll()
		.anyRequest()
			.authenticated()
		.and()
		.formLogin()
		.and()
		.logout();
	}
}
