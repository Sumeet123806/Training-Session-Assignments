package com.example.MyFirstPorject.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.MyFirstPorject.Repo.Repository;
import com.example.MyFirstPorject.Services.UserService;
import com.example.MyFirstPorject.profile.User;



@Controller
public class ControllerClass {

@RequestMapping("/")
public String infopage() {
	return "Info";
}

@Autowired
public UserService service;

@Autowired
Repository repo;


@RequestMapping(value = "/adduser", method = RequestMethod.POST)
public String add(User u,@RequestParam("file") MultipartFile file)  {
	
	 try {
		byte[] image = file.getBytes();
	    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		 String type = file.getContentType();
		u.setImage(image);
	    u.setFile_Name(fileName);
	    u.setFile_Type(type);
		service.adduser(u);
		
//		User u12 = new User();
//		u12.setFirst_name(first_name);
//		u12.setImage(image);
//		service.adduser(u12);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return "Info";
	
}


@RequestMapping("/update")
public String updatevalue() {
	return "update";
}

@RequestMapping(value="/updateimage", method=RequestMethod.POST)
public String update(@RequestParam("id") Integer id,@RequestParam("file") MultipartFile file,User u12) throws IOException {
	User user = repo.findById(id).get();
	u12.setEmail(user.getEmail());
	u12.setLast_name(user.getLast_name());
    u12.setPhon_no(user.getPhon_no());
    byte[] image = file.getBytes();
    u12.setImage(image);
    String fname = StringUtils.cleanPath(file.getOriginalFilename());
    String type = file.getContentType();
    u12.setFile_Name(fname);
    u12.setFile_Type(type);
    u12.setFirst_name(user.getFirst_name());
    service.adduser(u12);
    return "update";
    
}



	
	
	
}
