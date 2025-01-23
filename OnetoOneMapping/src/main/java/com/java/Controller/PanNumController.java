package com.java.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.Entity.PanNum;
import com.java.Service.PanNumService;

@RestController
public class PanNumController {

	
	@Autowired
	PanNumService service;
	
	public PanNum addPanNum(@RequestBody PanNum pan){
		return service.addPanNum(pan);
	}
	
	public List<PanNum> getAllPanNum(){
		return service.getAllPanNum();
	}
	
	public PanNum UpdateById(@RequestBody PanNum p) {
		return service.UpdateById(p);
	}

	public PanNum UpdateByName(@RequestBody PanNum p) {
		return service.UpdateByName(p);
	}
	public PanNum DeleteById(@PathVariable int id) {
		return service.deleteById(id);
	}
}
