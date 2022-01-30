package project;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection1 {
	Connection con1;
	public void connect() {
	 try{  
			//step1 load the driver class  
				Class.forName("oracle.jdbc.driver.OracleDriver");  
				 
				
				
				//step2 create  the connection object  
				Connection con=DriverManager.getConnection(  
				"jdbc:oracle:thin:@localhost:1521:xe","PHARMEASY","Sumeet12@");  
				
		con1 = con;		
  }
	 
	 catch(Exception e) {
		 System.out.println(e);
	 }
}
}