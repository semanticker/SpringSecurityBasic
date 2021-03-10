package kr.semanticker.config;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.HashSet;
import java.util.Set;

public class MyDatabaseUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        if("user".equals(s)){

            Set<GrantedAuthority> grantedAuthoritySet = new HashSet<>();
            // 롤(ROLE) 이름은 ROLE_역할 형태로 입력해야 한다.
            grantedAuthoritySet.add(new SimpleGrantedAuthority("ROLE_CALLCENTER"));
            return new User("user", "password", grantedAuthoritySet);
        }else {
            throw new UsernameNotFoundException("User Not Found.");
        }
    }
}
