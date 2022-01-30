package project;

import java.sql.SQLException;
import java.util.Scanner;

public class Signup_Validation {
	static Scanner sc = new Scanner(System.in);
	public static void logcheck(Login login) throws SQLException, ClassNotFoundException, InterruptedException {
		   
		System.out.println("Enter your email");
	   String email = sc.next();
	  Thread.sleep(1000);
	   System.out.println("Enter your password");
	   String pass = sc.next();
	   Thread.sleep(1000);
	  
		
		boolean check1 = false;
		check1 = login.check_detail(email, pass);
		
	
		if(check1) {
			
			System.out.println("Sign In Successfull..");
			System.out.println("Please Wait a moment to redirect you to the home page..");
			Thread.sleep(3000);
		  welcomescreenname wc = new welcomescreenname();
			String ans = wc.checkname(email);
			
			System.out.println();
			System.out.println("Welcome "+ ans);
		    Thread.sleep(1000);
		    System.out.println();
		    boolean check = true;
		    while(check) {
		   System.out.println("Please select from the below category to shop....");
		    System.out.println();
		   
		    
		    Fetchcategory fc = new Fetchcategory();
		    fc.getcategory();
		    
		
		    
		    int num = sc.nextInt();
		    
		    switch(num) {
		    
		    case 1:{
		    	System.out.println("Just a Moment....");
		    	Thread.sleep(3000);
		    	System.out.println("Here are all products under Talcum Powder category....");
		    	GetCategoryDetails gdt = new GetCategoryDetails();
		    	gdt.getres();
		    	
		    	System.out.println();
		    	System.out.println("1.Return to Main Menu \n 2.Logout");
		    	int num1 = sc.nextInt();
		    	if(num1==1) {
		    	 break;
		 		   }
		    	
		    	else {
		    		System.out.println("Wait a Moment....");
		    		Thread.sleep(3000);
		    		System.out.println("User Logged Off");
		    		check = false;
		    		break;
		    	}
		    	
		    	
			   
		    
		    }
	
		    
		    case 2:{
		    	
		    	System.out.println("Just a Moment....");
		    	Thread.sleep(3000);
		    	System.out.println("Here are all products under Ayurvedic Foods category....");
		    	GetCategoryDetails gdt = new GetCategoryDetails();
		    	gdt.getres1();
		    	int num1 = sc.nextInt();
		    	if(num1==1) {
		    	 break;
		 		   }
		    	
		    	else {
		    		System.out.println("Wait a Moment....");
		    		Thread.sleep(3000);
		    		System.out.println("User Logged Off");
		    		check = false;
		    		break;
		    	}
		    	
		    	 
		    }
		   
		    
		    
		    case 3:{
		    
		    	System.out.println("Just a Moment....");
		    	Thread.sleep(3000);
		    	System.out.println("Here are all products under Disinfectants  category....");
		    	GetCategoryDetails gdt = new GetCategoryDetails();
		    	gdt.getres2();	
		    	int num1 = sc.nextInt();
		    	if(num1==1) {
		    	 break;
		 		   }
		    	
		    	else {
		    		System.out.println("Wait a Moment....");
		    		Thread.sleep(3000);
		    		System.out.println("User Logged Off");
		    		check = false;
		    		 break;
		    	}
		    	 
		    }
		  
		    
		    
		    
		    
		    case 4:{
		    	
		    	System.out.println("Just a Moment....");
		    	Thread.sleep(3000);
		    	System.out.println("Here are all products under Pain Relief  category....");
		    	GetCategoryDetails gdt = new GetCategoryDetails();
		    	gdt.getres2();	
		    	int num1 = sc.nextInt();
		    	if(num1==1) {
		    	 break;
		 		   }
		    	
		    	else {
		    		System.out.println("Wait a Moment....");
		    		Thread.sleep(3000);
		    		System.out.println("User Logged Off");
		    		check = false;
		    		  break;
		    	}
		      
		     }
		
		    
		    case 5:{
		    	check = false;
		    	break;
		    }
		    }
		    		    
		    }
		}
		
		else {
			System.out.println("Invalid Username or Password please try again");
		}
	}
	}

