package com.example.MyFirstPorject.Usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class Admin_controller {

	
	
	@Autowired
	productrepo p12;
	@Autowired
	GlobalService s1;
	
	
	
	@RequestMapping("/prod")
	public String pro() {
		return "products";
	}
	
	
	@RequestMapping("/addproducts")
	
	public String addproduct(@RequestBody Product p) {
		s1.addproducts(p);
		return "products";
	}
	
	
	@DeleteMapping("/Deleteproducts/{id}")
	@ResponseBody
	public String deleteprod(@PathVariable int id) {
		boolean ans   = s1.deleteproduct(id);
		if(ans) {
			return "Product Deleted Sucessfully";
		}
		else {
			return "Unable to Delete the product please enter the correct id";
		}
	}
	
	

	
	
	
	
	@PutMapping("/updateproducts/{id}/{price}")
	@ResponseBody
	public String adminupdate(@PathVariable int id, @PathVariable int price,Product p ) {
		Product a1 = p12.findById(id).get();
		p.setProduct_id(id);
	    p.setProduct_name(a1.getProduct_name());
	    p.setProduct_discription(a1.getProduct_discription());
	    p.setProduct_quantity(a1.getProduct_quantity());
		p.setProduct_price(price);
		s1.addproducts(p);
		return "Product Update Success";
	}
	
	
	
	@DeleteMapping("/Deleteuser/{id}")
	@ResponseBody
	public String deleteuse(@PathVariable String id) {
		boolean ans   = s1.deleteuser(id);
		if(ans) {
			return "User Deleted Sucessfully";
		}
		else {
			return "Unable to Delete the User please enter the correct id";
		}
	}
	
	
	
}
