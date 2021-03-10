package kr.semanticker.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;


/**
 * 이 설정을 하지 않으면 아래 에러가 발생됨.
 * org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'springSecurityFilterChain' available
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

    public SecurityWebApplicationInitializer() {
        super(WebSecurityConfig.class);
    }
}
