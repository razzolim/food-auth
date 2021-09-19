package com.food.auth.core;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.food.auth.domain.Usuario;

import lombok.Getter;

@Getter
public class AuthUser extends User {
	
	private static final long serialVersionUID = -5560321797534977838L;
	
	private Long userId;
	private String fullName;
	
	public AuthUser(Usuario usuario, Collection<? extends GrantedAuthority> authorities) {
		super(usuario.getEmail(), usuario.getSenha(), authorities);		
		
		this.userId = usuario.getId();
		this.fullName = usuario.getNome();
	}

}
