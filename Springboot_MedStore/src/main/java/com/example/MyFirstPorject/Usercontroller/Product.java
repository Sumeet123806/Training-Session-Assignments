package com.example.MyFirstPorject.Usercontroller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_Details")
public class Product {

@Id	
private int product_id;
private String product_name;
private int product_price;
private int product_quantity;
private String product_discription;
public int getProduct_id() {
	return product_id;
}
public void setProduct_id(int product_id) {
	this.product_id = product_id;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public int getProduct_price() {
	return product_price;
}
public void setProduct_price(int product_price) {
	this.product_price = product_price;
}
public int getProduct_quantity() {
	return product_quantity;
}
public void setProduct_quantity(int product_quantity) {
	this.product_quantity = product_quantity;
}
public String getProduct_discription() {
	return product_discription;
}
public void setProduct_discription(String product_discription) {
	this.product_discription = product_discription;
}
public Product(int product_id, String product_name, int product_price, int product_quantity,
		String product_discription) {
	super();
	this.product_id = product_id;
	this.product_name = product_name;
	this.product_price = product_price;
	this.product_quantity = product_quantity;
	this.product_discription = product_discription;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_price=" + product_price
			+ ", product_quantity=" + product_quantity + ", product_discription=" + product_discription + "]";
}
	


}
