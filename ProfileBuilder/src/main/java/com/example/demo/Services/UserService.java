package com.example.demo.Services;


import java.awt.Image;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Repo.Repository;

import com.example.demo.profile.User;


@Service
public class UserService {

@Autowired
public Repository repo;

public void adduser(User u) {
	repo.save(u);
}


public String saveimage(MultipartFile file) {
String folder = "/photos/";
try {
	byte[] image = file.getBytes();
	Path path = Paths.get(folder+file.getOriginalFilename());
	
	Files.write(path, image);
	
	String location = path.toAbsolutePath().toString();
	return location;
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return "";

}


public FileSystemResource findInFileSystem(String location) {
    try {
        return new FileSystemResource(Paths.get(location));
    } catch (Exception e) {
        // Handle access or file not found problems.
        throw new RuntimeException();
    }
}

public FileSystemResource find(int imageId) {
  User u = repo.findById(imageId).get();
  
  return findInFileSystem(u.getLocation());
}





}
