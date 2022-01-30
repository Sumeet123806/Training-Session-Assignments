package project;
import java.sql.SQLException;
import java.util.Scanner;
public class Main {
	static  Scanner sc = new Scanner(System.in);
	
	
   public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		Details d = new Details();
		Signup sign = new Signup();
		Login login = new Login();
		Signin_validation signin  = new Signin_validation();
		Signup_Validation signup  = new Signup_Validation();
		admin_validation admin  = new admin_validation();
		Admin_login login1 = new Admin_login();
		Connection1 con1 = new Connection1();
	    System.out.println("WELCOME TO MY PHARMEASY");
		
	    System.out.println("Select from the following Numbers \n 1.New User \n 2.Existing User \n 3.Admin");
		Thread.sleep(1000);
	    int option = sc.nextInt();
	    
	    if(option==1) {
	    	signin.user_details(d,sign,login,signup);
	    	
	   }
	    
	    else if(option ==2) {
	    	signup.logcheck(login);
	    	
	    	
	    }
	    else if(option ==3) {
	      admin.isAdmin(login1);
	    }
	    
	    else {
	    	System.out.println("OOPS INVALID INPUT");
	    }

	}

}
