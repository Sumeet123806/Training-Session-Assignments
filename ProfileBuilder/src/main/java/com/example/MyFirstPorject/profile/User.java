package com.example.MyFirstPorject.profile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Entity
@Table(name="ProfileData")
@Component
public class User extends BaseEntity{
	
       @Id
       @Column(name = "Id")
	  @GeneratedValue(strategy=GenerationType.AUTO)
      private int id;
       @Column(name="First_Name")
	  private String first_name;
       @Column(name="Last_Name")
	  private String Last_name;
       @Column(name="Phone_Number")
	  private String phon_no;
       @Column(name="Email")
       private String email;
      
       @Lob
       @Column(name = "Image")
       private byte[] image;
       
       @Column(name="File_Type")
       private String File_Type;
       
       @Column(name="File_Name")
       private String File_Name;


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}







	public User(int id, String first_name, String last_name, String phon_no, String email, byte[] image,
			String file_Type, String file_Name) {
		super();
		this.id = id;
		this.first_name = first_name;
		Last_name = last_name;
		this.phon_no = phon_no;
		this.email = email;
		this.image = image;
		File_Type = file_Type;
		File_Name = file_Name;
	}







	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return Last_name;
	}

	public void setLast_name(String last_name) {
		Last_name = last_name;
	}

	public String getPhon_no() {
		return phon_no;
	}

	public void setPhon_no(String phon_no) {
		this.phon_no = phon_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}



	public String getFile_Type() {
		return File_Type;
	}



	public void setFile_Type(String file_Type) {
		File_Type = file_Type;
	}



	public String getFile_Name() {
		return File_Name;
	}



	public void setFile_Name(String file_Name) {
		File_Name = file_Name;
	}
	  
	  
}
