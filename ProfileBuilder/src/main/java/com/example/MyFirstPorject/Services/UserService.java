package com.example.MyFirstPorject.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyFirstPorject.Repo.Repository;
import com.example.MyFirstPorject.profile.User;

@Service
public class UserService {

@Autowired
public Repository repo;

public void adduser(User u) {
	repo.save(u);
}

}
