package com.example.MyFirstPorject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MyFirstPorject.profile.User;

public interface Repository extends JpaRepository<User,Integer> {

}
