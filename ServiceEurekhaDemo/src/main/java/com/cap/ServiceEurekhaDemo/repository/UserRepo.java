package com.cap.ServiceEurekhaDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.ServiceEurekhaDemo.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{

}
