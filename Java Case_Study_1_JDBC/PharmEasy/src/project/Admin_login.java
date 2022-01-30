package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Admin_login {

	Connection1 c1 = new Connection1();
	public boolean check_detail1(String email,String pass)throws SQLException, ClassNotFoundException {
		  try{  
			//step1 load the driver class  
				c1.connect();  
				//step3 create the statement object  
				Statement stmt=c1.con1.createStatement();  
				
				String query = "SELECT PASSWORD FROM ADMIN_INFO WHERE EMAIL= '"+email+"'";
				//step4 execute query  
				ResultSet rs=stmt.executeQuery(query);  
				rs.next();  
				  String passcheck = rs.getString(1);
				  
				  if(pass.equals(passcheck)) {
					  return true;
				  }
				  
	              
		    //step5 close the connection object  
				c1.con1.close(); 
				
			
			
				}catch( SQLException e){ 
				 System.out.println("Invalid Email");
				}  
		
		  return false;
	  }
}
