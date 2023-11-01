package net.javaguides.springboot.security;


import lombok.AllArgsConstructor;
import net.javaguides.springboot.model.Authority;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority {

    private final Authority authority;

    @Override
    public String getAuthority() {
        return authority.getName();
    }
}
