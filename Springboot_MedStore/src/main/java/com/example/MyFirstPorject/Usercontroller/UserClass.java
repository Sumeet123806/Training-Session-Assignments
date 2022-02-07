package com.example.MyFirstPorject.Usercontroller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserTable")
public class UserClass {
    @Id
	private String email;
    @Column(name = "name")
	private String name;
    @Column(name = "password")
	private String password;
    @Column(name = "phone_number")
	private String phone_number;
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
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public UserClass(String email, String name, String password, String phone_number) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.phone_number = phone_number;
	}
	public UserClass() {
		super();
	}
	@Override
	public String toString() {
		return "UserClass [email=" + email + ", name=" + name + ", password=" + password + ", phone_number="
				+ phone_number + "]";
	}
	
	
	
	
}
