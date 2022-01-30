package project;
import java.sql.SQLException;
import java.util.*;
public class admin_validation {
    static Scanner sc = new Scanner(System.in);
    
    Admin_add_Product admin_add = new Admin_add_Product();
    product p = new product();
	public void isAdmin(Admin_login login1) throws InterruptedException, ClassNotFoundException, SQLException {
		
		System.out.println("Hello Admin....");
		System.out.println("Let do a Quick Check...");
		Thread.sleep(1000);
		System.out.println("Enter email");
		String email = sc.next();
		
		Thread.sleep(1000);
		System.out.println("Enter password");
		String pass = sc.next();
		boolean check = false;
		check = login1.check_detail1(email,pass);
		if(check) {
			
			System.out.println("Wait a moment......");
			Thread.sleep(3000);
			
			
			System.out.println("Admin Validated");
            
		
	     boolean check2  = true;
	         while(check2) {
	        	 
	        	 System.out.println("Choose the below number for  operation to be performed \n 1.Add Products \n 2.Update Product \n 3.Delete Product \n 4.Delete User \n5 Logout");
	        	    int num = sc.nextInt();
	         switch(num) {
	         
	         case 1:{
	        	 
	        	 System.out.println("Insert the following product details...");
	        	 Thread.sleep(1000);
	        	 
	        	
	        	  admin_add.getproductinput(p);
	 	        	 admin_add.addproduct(p);
	        	 System.out.println("Product Inserted Successfully..");
	        	 while(true) {
	        		 
	        		 System.out.println("1.To insert item again \n 2.To Exit");
	        		
	        		 int num1 = sc.nextInt();
	        		 if(num1==1) {
	        			  admin_add.getproductinput(p);
	     	        	 admin_add.addproduct(p); 
	    	        	 System.out.println("Product Inserted Successfully..");
	        		 }
	        		 else if(num1==2) {
	        			 break;
	        		 }
	        	 }
	        	 
	        	 
	        	 
	        	 break;
	        	 }
	         
	         case 2:{
	        	
	        	 sc.nextLine();
	        	 System.out.println("Enter the Product name to be updated...");
		        	String sc1 = sc.nextLine();
		        	System.out.println("Enter the Updated Amount of Product...");
		        	int sc2 = sc.nextInt();
		        	admin_add.updateProduct(sc1,sc2);
		        	 System.out.println("Product Updated Successfully..");
		        	while(true) {
		        		System.out.println("1.Update product again \n 2.Exit");
		        		int value = sc.nextInt();
		        	    
		        	  if(value==1) {
		        		  System.out.println("Enter the Product name to be updated...");
		        		  sc.nextLine();
		        		  sc1 = sc.nextLine();
		        		  
		        		  System.out.println("Enter the Updated Amount of Product...");
				        	 sc2 = sc.nextInt();
		        		  admin_add.updateProduct(sc1,sc2);
		        		  System.out.println("Product Updated Successfully..");
		        	  }
		        	  else {
		        		  break;
		        	  }
		        	 
	        	 
	         }
		        	break;
		        	}
	         
	         
	         case 3:{
	        	sc.nextLine();
	        	 System.out.println("Enter the Product name to be deleted...");
		        	String sc1 = sc.nextLine();
		        	admin_add.deleteProduct(sc1);
		        	 System.out.println("Product Deleted Successfully..");
		        	while(true) {
		        		System.out.println("1.Delete product again \n 2.Exit");
		        		int value = sc.nextInt();
		        	    
		        	  if(value==1) {
		        		  System.out.println("Enter the Product name to be deleted...");
		        		  sc.nextLine();
		        		  sc1 = sc.nextLine();
		        		  admin_add.deleteProduct(sc1);
				        	 System.out.println("Product Deleted Successfully..");
		        	  }
		        	  else {
		        		  break;
		        	  }
		        	}
		        	
		        	break;
	   }
	         
	         
	         
	         case 4:{
	        	 
	        	 
	        	System.out.println("Enter the email of which user you want to delete...");
	        	String sc1 = sc.next();
	        	admin_add.deleteuser(sc1);
	       	 System.out.println("User Deleted Successfully..");
	        	while(true) {
	        		
	        	System.out.println("1.Delete new User\n 2.To Exit");
	        	int num2 = sc.nextInt();
	        	if(num2==1) {
	        		 sc1 = sc.next();
		        	admin_add.deleteuser(sc1);
		        	 System.out.println("User Deleted Successfully..");
	        	}
	        	else if(num2==2) {
	        		System.out.println("All the Selected Users are deleted successfully");
	        		break;
	        	}
	        	
	        	}
	        	break; 
	         }
	         
	         
	         
	         case 5:{
	        	 System.out.println("Successfully Logged Out ");
	        	 check2 = false;
	        	 break;
	         }
	         
	         default:{
	        	 
	        	 System.out.println(" Invalid Option,Please select the correct option above");
	        	 break;
	         }
	         
	        }
	         
	         }
	         
	        
		
		}
		
		 else {
			System.out.println("Invalid Entry..");
		}
	}
}
