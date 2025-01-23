package com.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.entity.User;
import com.login.repo.UserRepo;



	@Service
	public class UserService {
	    private final UserRepo userrepo;;

	    @Autowired
	    public UserService(UserRepo userrepo) {
	        this.userrepo = userrepo;
	    }

	    public void saveUser(User user) {
	        userrepo.save(user);
	    }
	}

	

