package com.example.springvue.config;

import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//IF you want to add a new page to the website, add a ".antMatchers("/page_name/**").permitAll()"
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()

                .authorizeRequests()
                .antMatchers("/js/**").permitAll()
                .antMatchers("/css/**").permitAll()
                .antMatchers("/login/**").permitAll()
                .antMatchers("/api/**").permitAll()
                .antMatchers("/example-page/**").permitAll() // allow any user to view any route with /example-page prefixed to it
                .antMatchers("/rest/**").permitAll() // allow any user to view any route with /rest prefixed to it (we would want to implement security around this)
                .antMatchers("/welcome/**").permitAll()
                .antMatchers("/stream/**").permitAll()
                .antMatchers("/users/**").permitAll()
                .antMatchers("/user/**").permitAll()
                .antMatchers("/unauthorized").permitAll()
                .antMatchers(("/admin")).permitAll()
                .antMatchers("/admin-login/**").permitAll() // allow any user to view any route with /admin-login prefixed to it
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .usernameParameter("email")
                .passwordParameter("password")
                .failureUrl("/unauthorized")
                .permitAll()
                .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login?logout") // Temporary redirect
                .deleteCookies("JSESSIONID")
                .invalidateHttpSession(true);
    }

    @Bean
    public ErrorProperties errorProperties() {
        ErrorProperties properties = new ErrorProperties();

        properties.setIncludeStacktrace(ErrorProperties.IncludeStacktrace.NEVER);
        properties.setPath("/error");

        return properties;
    }
}