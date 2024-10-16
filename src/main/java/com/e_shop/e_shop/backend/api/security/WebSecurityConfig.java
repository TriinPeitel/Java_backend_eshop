package com.e_shop.e_shop.backend.api.security;

import com.auth0.jwt.JWT;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.intercept.AuthorizationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
public class WebSecurityConfig {
    private JWTRequestFilter jwtRequestFilter;

    public WebSecurityConfig(JWTRequestFilter jwtRequestFilter) {
        this.jwtRequestFilter = jwtRequestFilter;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable()).cors(cors -> cors.disable());
        http.addFilterBefore(jwtRequestFilter, AuthorizationFilter.class);
        //http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
        http.authorizeHttpRequests(authz -> authz
                //.requestMatchers(new AntPathRequestMatcher("/product")).permitAll()
                .requestMatchers( "/product", "/auth/register", "/auth/login").permitAll()
                //.requestMatchers(HttpMethod.GET, "/product", "/auth/register", "/auth/login").permitAll()
                //.requestMatchers("/product", "/auth/register", "/auth/login").permitAll()
                .anyRequest().authenticated());
        return http.build();

    }
}


