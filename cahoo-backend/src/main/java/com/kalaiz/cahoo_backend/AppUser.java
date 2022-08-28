package com.kalaiz.cahoo_backend;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class AppUser implements UserDetails{

	// TODO: Remove username
	private @Id @GeneratedValue(strategy=GenerationType.AUTO)Long id;
	private String name;
	private String username;
	private String email;
	private String password;
	private Boolean enabled;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	private int points;
	private Boolean locked;
	public String getEmail() {
		return email;
	}

	public AppUser(String name, String username, String email, String password, Role role, int points, Boolean locked,
			Boolean enabled) {
	
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
		this.points = points;
		this.locked = locked;
		this.enabled = enabled;
	}

	public AppUser() {}

	public void setEmail(String email) {
		this.email = email;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public Boolean getLocked() {
		return locked;
	}


	public void setLocked(Boolean locked) {
		this.locked = locked;
	}


	public Boolean getEnabled() {
		return enabled;
	}


	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.name());
		return Collections.singleton(authority);
	}


	@Override
	public String getPassword() {
		return password;
	}


	@Override
	public String getUsername() {
		return username;
	}


	@Override
	public boolean isAccountNonExpired() {
		return true;
	}


	@Override
	public boolean isAccountNonLocked() {
		return !locked;
	}


	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}


	@Override
	public boolean isEnabled() {
		return enabled;
	}
	
}
