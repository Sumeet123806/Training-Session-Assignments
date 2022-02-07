package com.example.MyFirstPorject.Usercontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class GlobalService {

	@Autowired
	public userrepo1 r1;
	
	
	@Autowired
	public adminrepo r2;
	
	
	@Autowired
	public productrepo p1;
	PasswordEncoder password;
	
	public GlobalService() {
		this.password = new BCryptPasswordEncoder();
	}
	
	public void adduser(UserClass u2) {
		String password = this.password.encode(u2.getPassword());
		u2.setPassword(password);
	 	r1.save(u2);
	 	
	}
	
	public void addadmin(admin a1) {
	r2.save(a1);
	}
	
	
	public List <UserClass> getAllUsers()
	{
		List<UserClass> users=new ArrayList<UserClass>();
		
		r1.findAll().forEach(user -> users.add(user));
		return users;
	}
 
	
	
	public List <Product> getAllProduct()
	{
		List<Product> product=new ArrayList<Product>();
		
		p1.findAll().forEach(Product -> product.add(Product));
		return product;
	}
 
	
	
	
	
	public void addproducts(Product p2) {
	 p1.save(p2);
	}
	
	
	
	public boolean deleteproduct(int id) {
		boolean check = false;
		
		if(p1.findById(id).isPresent()) {
			p1.deleteById(id);
			check =true;
		}
		else {
			check = false;
		}
		return check;
	}
	

	public boolean deleteuser(String id) {
		boolean check = false;
		
		if(r1.findById(id).isPresent()) {
			r1.deleteById(id);
			check =true;
		}
		else {
			check = false;
		}
		return check;
	}
	
	
	
	
	public String getpass(String email) {
		if(r1.findById(email).isPresent()) {
		UserClass u1 = r1.findById(email).get();
		String pass = u1.getPassword();
		
		return pass;
	}
		return "abc";
	
	
}
	
	
	
	
}
