package com.example.demo.Controller;


import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Repo.Repository;
import com.example.demo.Services.UserService;
import com.example.demo.profile.User;



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
	
	
		
	    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		 String type = file.getContentType();
		 String location = service.saveimage(file);
	
	    u.setFile_Name(fileName);
	    u.setFile_Type(type);
	    u.setLocation(location);
	
		service.adduser(u);
		
		
//		User u12 = new User();
//		u12.setFirst_name(first_name);
//		u12.setImage(image);
//		service.adduser(u12);
		
	
	
	return "Fileupload";
	
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
    String fname = StringUtils.cleanPath(file.getOriginalFilename());
    String type = file.getContentType();
    String location = service.saveimage(file);
    u12.setFile_Name(fname);
    u12.setFile_Type(type);
    u12.setLocation(location);
    u12.setFirst_name(user.getFirst_name());
    service.adduser(u12);
    return "Fileupload";
    
}




@RequestMapping("/download")
public String check() {
	return "Fileupload";
}


@RequestMapping(value="/getimage",produces = MediaType.IMAGE_JPEG_VALUE,method=RequestMethod.GET)
public ModelAndView downloadImage(@RequestParam("id") int id) throws Exception {
 File file  =   service.find(id).getFile();
 String file_name = file.getAbsolutePath().toString();

 String ans = file_name.replace("\\", "\\\\");	 
 
 BufferedImage bImage = ImageIO.read(new File(ans));//give the path of an image
 ByteArrayOutputStream baos = new ByteArrayOutputStream();
 ImageIO.write( bImage, "jpg", baos );
 baos.flush();
 byte[] imageInByteArray = baos.toByteArray();
 baos.close();                                   
 String b64 = DatatypeConverter.printBase64Binary(imageInByteArray);

User u = new User();
u  = repo.findById(id).get();

 ModelAndView mv = new ModelAndView();
 
mv.addObject("Userinfo", u);
 mv.addObject("filename", b64);
 mv.setViewName("check");
 return mv;
  
}

@RequestMapping("/check")
public String check1() {
	return "check";
}

}