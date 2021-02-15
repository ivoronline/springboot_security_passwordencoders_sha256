package com.ivoronlne.springboot_security_passwordencoders_sha256.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  //====================================================================
  // PASSWORD ENCODER
  //====================================================================
  @Bean
  PasswordEncoder passwordEncoder() {
    return new StandardPasswordEncoder();
  }

  //====================================================================
  // CONFIGURE
  //====================================================================
  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.authorizeRequests().antMatchers("/EncodePassword").permitAll(); //Anonymouse Access
    httpSecurity.authorizeRequests().anyRequest().authenticated();               //Authenticated Access
    httpSecurity.formLogin();                                                    //Default Logn Form

  }

}
