package project;

import java.sql.SQLException;
import java.util.Scanner;

public class Signin_validation {
      static Scanner sc = new Scanner(System.in);
	public static void user_details(Details d,Signup sign,Login login,Signup_Validation signup) throws ClassNotFoundException, SQLException, InterruptedException {
		boolean check = false;
		System.out.println("Hello Please Enter the Following Details :");
		sc.nextLine();
		Thread.sleep(1000);
    	System.out.println("Enter your name");
    	String name = sc.nextLine();
		Thread.sleep(1000);
    	System.out.println("Enter your Phone Number");
        String phono = sc.nextLine();
		Thread.sleep(1000);
        System.out.println("Enter your password");
    	String pass = sc.nextLine();
		Thread.sleep(1000);
    	System.out.println("Enter your email");
    	String email = sc.nextLine();
    	
    	d.setName(name);
        d.setPhno(phono);
        d.setPass(pass);
        d.setEmail(email);
        check = sign.addUser(d);


        
        
        if(check) {

           System.out.println("Just a moment.......");
   		Thread.sleep(3000);            
          
           
           System.out.println();
           
           System.out.println("You have been Successfully registered ......");
           
   		Thread.sleep(2000);
           
           System.out.println("Enter No.4 to enter to the login page....");
           int num = sc.nextInt();
           
         
           if(num==4) {
       		Thread.sleep(2000);
        	   System.out.println("You are on the login page");
        	  
        	   
           signup.logcheck(login);
           }
           
           else {
        	   System.out.println("Please Enter no 4");
           }
          }
        else {
        	System.out.println("Sign In Failed");
        }
    	}
	
}
