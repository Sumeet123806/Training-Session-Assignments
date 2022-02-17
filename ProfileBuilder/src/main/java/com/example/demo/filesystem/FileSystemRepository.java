package com.example.demo.filesystem;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class FileSystemRepository {

	
   public String RESOURCES_DIR = FileSystemRepository.class.getResource("/")
            .getPath();

     public String save1(byte[] content, String imageName) throws Exception {
            Path newFile = Paths.get(RESOURCES_DIR + new Date().getTime() + "-" + imageName);
            Files.createDirectories(newFile.getParent());

            Files.write(newFile, content);

            return newFile.toAbsolutePath()
                .toString();
        }
	
}
