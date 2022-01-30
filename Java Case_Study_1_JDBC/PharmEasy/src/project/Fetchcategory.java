package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetchcategory {
	Connection1 c1 = new Connection1();
	public void getcategory() {
      
	  try{  
			c1.connect();
			Statement stmt=c1.con1.createStatement();

			String query = "SELECT PCATEGORY FROM PRODUCTS GROUP BY PCATEGORY";
			ResultSet rs = stmt.executeQuery(query);
			int num=1;
			while(rs.next())
			System.out.println(num++ +" " +"."+rs.getString(1));
			
				
			
}
	  
	  catch( SQLException e){ 
			 System.out.println(e.getMessage());
			} 
	  
	}
}
