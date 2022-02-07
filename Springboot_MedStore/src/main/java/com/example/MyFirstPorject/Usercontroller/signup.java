package com.example.MyFirstPorject.Usercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class signup {

    
	@Autowired
	GlobalService s1;
	
	
PasswordEncoder password12;
	
	public signup() {
		this.password12 = new BCryptPasswordEncoder();
	}
	
	
	
	@RequestMapping("/adduser")
	public String setuser(@RequestBody UserClass u2) {
		 s1.adduser(u2);
		 return "home";
	}
	
	@DeleteMapping("/deleteuser")
	public void deleteuser(@PathVariable String email) {
		s1.deleteuser(email);
	}
	
	
	@RequestMapping("/")
	public String showuser() {
		return "getvalue";
	}
	
	
	@RequestMapping("/checkuser/{email}/{password}")
	public String check(@PathVariable String email, @PathVariable String password) {
		
	     
		String getpass = s1.getpass(email);
		
		if(getpass!="abc") {
		
		
		if(password12.matches(password,getpass)) {
			return "home";
		}
		else {
			return "index";
		}
	}
		else {
			return "email";
		}
	}
	
	
	
		@GetMapping("/adminviewuser")
		@ResponseBody
		public List<UserClass>getAllUser()
		
		{
			return s1.getAllUsers();
			
		}
		
		
		@GetMapping("/viewproduct")
		@ResponseBody
		public List<Product>getAllProduct()
		
		{
			return s1.getAllProduct();
			
		}
	
}

