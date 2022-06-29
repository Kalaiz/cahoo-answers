package com.kalaiz.cahoo_backend;

import java.util.Objects;

public class Registration {
	
	
	private final String name;
	private final String email;
	private final String password;

	public Registration(String name, String email, String password) {
	
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "RegistrationRequest [Name=" + name + ", email=" + email
				+ ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, name, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registration other = (Registration) obj;
		return Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}
}
