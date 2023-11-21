package net.javaguides.springboot.config.multiple_security_filters;

import net.javaguides.springboot.config.multiple_security_filters.filters.ApiKeyFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class SecurityConfig {

    @Value("${our.very.very.very.secret.key}")
    private String key;

    //defines config in which api can be validated by either of basicAuth or customApikey auth
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.httpBasic()
                .and()
                .addFilterBefore(new ApiKeyFilter(key), BasicAuthenticationFilter.class)
                .authorizeRequests().anyRequest().authenticated()   // authorization
                //.and().authenticationManager()   or  by adding a bean of type AuthenticationManager
                //.and().authenticationProvider() it doesn't override the AP, it adds one more to the collection
                .and().build();
    }
}
