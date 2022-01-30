package project;
import java.sql.*;
public class Signup {
public boolean addUser(Details d) throws SQLException, ClassNotFoundException {
	Connection1 c1 = new Connection1();
		boolean check  = false;
		try{  
			//step1 load the driver class  
			c1.connect();
			
		    
			//step3 create the statement object  
	 
			
			
			String query = "INSERT INTO USER_INFO  VALUES(?,?,?,?)";
			PreparedStatement pst=c1.con1.prepareStatement(query); 	
			 
		  
			pst.setString(1, d.getName());
			pst.setString(2, d.getPhno());
			pst.setString(3, d.getPass());
			pst.setString(4, d.getEmail());
			pst.executeUpdate();
			
		    check = true;
			
			
			c1.con1.close();  
			  }
		catch(SQLIntegrityConstraintViolationException e){ System.out.println("User already exists in the database");
		
		} 
		catch(Exception e) {
			System.out.println(e);
		}
			  
		return check;
		
		
	}
}
