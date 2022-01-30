package project;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class Admin_add_Product {
	Connection1 c1 = new Connection1();
	static Scanner sc = new Scanner(System.in);
	
	
	
	public void getproductinput(product p) throws InterruptedException {
		
		System.out.println("Enter the product name ");
		String name = sc.nextLine();
		Thread.sleep(1000);
		
		System.out.println("Enter the Product price ");
		String price = sc.nextLine();
		
		Thread.sleep(1000);
		
		System.out.println("Enter the Product Category");
		String category = sc.nextLine();
		
		Thread.sleep(1000);
		
		System.out.println("Enter the Product Description ");
		String desp = sc.nextLine();
		
		Thread.sleep(1000);
		
		System.out.println("Enter the product Quantity");
		String quantity= sc.nextLine();
		p.setName(name);
		p.setPrice(price);
		p.setCategory(category);
		p.setDescription(desp);
		p.setQuantity(quantity);
		
		
	}
	
	
	
	public void addproduct(product p1) {
		try {
			
			
			
			c1.connect();
			
			String query = "INSERT INTO PRODUCTS  VALUES(?,?,?,?,?)";
			PreparedStatement pst=c1.con1.prepareStatement(query); 	
			
			
		    pst.setString(1, p1.getName());
		    pst.setString(2, p1.getPrice());
		    pst.setString(3, p1.getCategory());
		    pst.setString(4,p1.getDescription());
		    pst.setString(5, p1.getQuantity());
		    
			
			pst.executeUpdate();
			
			 }
		 catch(SQLIntegrityConstraintViolationException e){ 
	    	   System.out.println("User already exists in the database");
			
			} 
			
			catch(Exception e) {
			  System.out.println(e);	
			}
		
	}
	
	
	
	public void deleteuser(String email) {
		try {
		c1.connect();
		Statement stmt=c1.con1.createStatement();  
		String query = "DELETE FROM USER_INFO WHERE EMAIL = '"+email+"'";
		int count =stmt.executeUpdate(query);  

		
	
		
		
		c1.con1.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		
	}
	
	
	public void deleteProduct(String pname) {
		try {
			c1.connect();
			Statement stmt=c1.con1.createStatement();  
			String query = "DELETE FROM PRODUCTS WHERE PNAME = '"+pname+"'";
			int count =stmt.executeUpdate(query);  

			
		
			
			
			c1.con1.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
	}
	
	
	public void updateProduct(String pname,int amount) {
		try {
			c1.connect();
			Statement stmt=c1.con1.createStatement();  
			String query = "UPDATE PRODUCTS SET PPRICE = "+amount+" WHERE PNAME = '"+pname+"'";
			int count = stmt.executeUpdate(query);
		}
		
		catch(Exception e){ System.out.println(e);}  
	}
	
	
}
