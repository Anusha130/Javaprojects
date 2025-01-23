package com.review.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.review.model.Project;
import com.review.service.ProjectService;

@RestController
@RequestMapping("project")
public class ProjectController {
	@Autowired
	private ProjectService service;

	@PostMapping("/add")

	public Project addproject(@RequestBody Project pro) {
		return service.addproject(pro);
	}

	/*
	 * @GetMapping("/all") public List<Project> allprojects(@RequestBody Project
	 * pro) { return service.allprojects();
	 * 
	 * }
	 */

	@GetMapping("/all")
	public ResponseEntity<List<Project>> allprojects() {
		List<Project> project = service.allprojects();
		return new ResponseEntity<>(project, HttpStatus.OK);
	}

	@PutMapping("/Updatebyname{name}")
	public Project updateProject(@RequestParam("name") Project pro) {
		return service.updateProject(pro);
	}

	@DeleteMapping("/deleteById/{Id}")
	public void DeleteProject(@PathVariable("id") int id) {
		service.deleteProject(id);

	}

	@PostMapping("/{id}")
	public Optional<Project> getId(@PathVariable int id) {
		return service.getIdByPost(id);
	}

//sorting
	@GetMapping("/sort/{field}")
	public List<Project> sortprojects(@PathVariable String field) {
		return service.sortBaseduponSomeField(field);

	}

	@GetMapping("/paginatiom/{offset}/{pageSize}")
	public Page<Project> sortprojects(@PathVariable int offset, @PathVariable int pageSize) {
		return service.getProjectWithPagination(offset, pageSize);

	}

	@GetMapping("/pagination/{offset}/{pagesize}/{field}")
	public Page<Project> PaginationAndSorting(@PathVariable int offset, @PathVariable int pagesize,
			@PathVariable String field) {
		return service.pageAndSorting(offset, pagesize, field);

	}

	@GetMapping("/getById/{id}")
	public Optional<Project> fetchById(@PathVariable("id") int id) {

		Optional<Project> e = service.findById(id);
		// String status = null;
		if (e.isPresent()) {
			return service.findById(id);

		}
		return e;

	}

}
