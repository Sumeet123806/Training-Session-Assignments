package project;

import java.sql.ResultSet;
import java.sql.Statement;

public class GetCategoryDetails {
	Connection1 c1 = new Connection1();
	public void getres() {
		try {
			c1.connect();
			Statement stmt=c1.con1.createStatement();  
			String query = "SELECT PNAME,PPRICE	 FROM PRODUCTS WHERE PCATEGORY='Talcum Powder' ";
			int num=1;
			
			System.out.println();
			ResultSet rs = stmt.executeQuery(query);
	
			while(rs.next()) {
				System.out.println("Product Name :"+rs.getString(1)+"   "+"Product Price :"+rs.getInt(2));
			}
			
	}
		catch(Exception e) {
			System.out.println(e);
		}
	
}
	
	public void getres1() {
		try {
			c1.connect();
			Statement stmt=c1.con1.createStatement();  
			String query = "SELECT PNAME,PPRICE	 FROM PRODUCTS WHERE PCATEGORY='Ayurvedic Foods' ";
			int num=1;
			
			System.out.println();
			ResultSet rs = stmt.executeQuery(query);
	
			while(rs.next()) {
				System.out.println("Product Name :"+rs.getString(1)+"   "+"Product Price :"+rs.getInt(2));
			}
			
	}
		catch(Exception e) {
			System.out.println(e);
		}
	
}
	
	
	public void getres2() {
		try {
			c1.connect();
			Statement stmt=c1.con1.createStatement();  
			String query = "SELECT PNAME,PPRICE	 FROM PRODUCTS WHERE PCATEGORY='Disinfectants' ";
			int num=1;
			
			System.out.println();
			ResultSet rs = stmt.executeQuery(query);
	
			while(rs.next()) {
				System.out.println("Product Name :"+rs.getString(1)+"   "+"Product Price :"+rs.getInt(2));
			}
			
	}
		catch(Exception e) {
			System.out.println(e);
		}
	
}
	
	
	public void getres3() {
		try {
			c1.connect();
			Statement stmt=c1.con1.createStatement();  
			String query = "SELECT PNAME,PPRICE	 FROM PRODUCTS WHERE PCATEGORY='Pain Relief' ";
			int num=1;
			
			System.out.println();
			ResultSet rs = stmt.executeQuery(query);
	
			while(rs.next()) {
				System.out.println("Product Name :"+rs.getString(1)+"   "+"Product Price :"+rs.getInt(2));
			}
			
	}
		catch(Exception e) {
			System.out.println(e);
		}
	
}
	
	
}
