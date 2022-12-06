package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.FormLoginBeanDefinitionParser;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@ Configuration		// 설정 관련 어노테이선
@EnableWebSecurity	// Spring에서 매우 자주 사용하는 시큐리티 어노테이션
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	// 설정에 관련된 소스코드는 config 패키지 안에...
	// 해당 파일은 보안 관련 설정 파일...
	
	/**
	 * @Since : 2022. 12. 6.
	 * @Author : Jeong_Dahyeon
	 * @Return : PasswordEncoder
	 * @Comment : 특정 변수 암호화
	 */
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.formLogin().disable();
	}
	
}
