package com.cursojava.curso.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String name;
	private String emailString;
	private String phone;
	private String password;

	public User()  {
	}

	public User(Long id, String name, String emailString, String phone, String password) {
		this.id = id;
		this.name = name;
		this.emailString = emailString;
		this.phone = phone;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailString() {
		return emailString;
	}

	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}