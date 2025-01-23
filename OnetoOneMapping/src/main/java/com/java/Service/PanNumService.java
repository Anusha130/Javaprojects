package com.java.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.Entity.PanNum;
import com.java.Entity.Person;
import com.java.Repository.PanNumRepository;

@Service
public class PanNumService {

	
	@Autowired
	PanNumRepository repo;
	public PanNum addPanNum(PanNum pan) {
		// TODO Auto-generated method stub
		return repo.save(pan);
	}
	public List<PanNum> getAllPanNum() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	public PanNum UpdateById(PanNum p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}
	public PanNum UpdateByName(PanNum p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}
	public PanNum deleteById(int id) {
		// TODO Auto-generated method stub
		return repo.save(id);
	}

}
