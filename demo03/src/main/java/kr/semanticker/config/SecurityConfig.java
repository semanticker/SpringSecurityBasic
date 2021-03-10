package kr.semanticker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecurityConfig {

/*
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        */
/*auth
                .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");*//*

    }
    */
/*@Bean
        public BCryptPasswordEncoder bCryptPasswordEncoder() {
            return new BCryptPasswordEncoder();
        }*//*


    @Bean
    public UserDetailsService userDetailsService() {
        return new MyDatabaseUserDetailsService(); // (1)
    }

*/

}
