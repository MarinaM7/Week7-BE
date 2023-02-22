package com.marina.Giorno2.config;

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
			.antMatchers("/", "/app/data1", "/app/data2", "/app/data3")
			.permitAll()
		.anyRequest()
			.authenticated()
		.and()
		.formLogin()
		.and()
		.logout();
	}
}
