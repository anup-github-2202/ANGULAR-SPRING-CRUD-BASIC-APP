package net.javaguides.springboot.config;


import net.javaguides.springboot.repository.UserRepository;
import net.javaguides.springboot.service.JpaUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig {



    // defined user inmemory (non persistent)
//    @Bean
//    public UserDetailsService userDetailsService() {
//        var uds = new InMemoryUserDetailsManager();
//
//        var u1 = User.withUsername("admin")
//                .password("admin")
//                .authorities("read")
//                .build();
//
//        uds.createUser(u1);
//
//        return uds;
//    }



    @Bean
    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
        return NoOpPasswordEncoder.getInstance();
    }
}
