package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class welcomescreenname {
	Connection1 c1 = new Connection1();
	public String checkname(String email) {
       String name="";
	  try{  
			c1.connect();
			  
			//step3 create the statement object  
			Statement stmt=c1.con1.createStatement();
			
			String query = "SELECT NAME FROM USER_INFO WHERE EMAIL = '"+email+"'";
	         
			ResultSet rs=stmt.executeQuery(query);
			rs.next();
		   name = rs.getString(1);
            			
}
	  
	  catch(Exception e) {
		  
	  }
	  return name;
	}
	  
}
