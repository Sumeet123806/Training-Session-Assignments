package com.example.MyFirstPorject.Usercontroller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_table")
public class admin {
    @Id
	private String email;
	private String name;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public admin(String email, String name, String password) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
	}
	public admin() {
		super();
	
	}
	@Override
	public String toString() {
		return "admin [email=" + email + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
}
