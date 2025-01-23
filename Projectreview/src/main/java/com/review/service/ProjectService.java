package com.review.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.review.model.Project;
import com.review.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	ProjectRepository repo;

	public Project addproject(Project pro) {
		// TODO Auto-generated method stub
		return repo.save(pro);
	}

	/*
	 * public List<Project> allprojects() { // TODO Auto-generated method stub
	 * return repo.findAll(); }
	 */
	public List<Project> allprojects() {
		try {
			return repo.findAll();
		} catch (Exception ex) {
			throw new RuntimeException("An error occurred while retrieving employees.");
		}
	}

	public Project updateProject(Project pro) {
		// TODO Auto-generated method stub
		return repo.save(pro);
	}

	public void deleteProject(int id) {
		repo.deleteById(id);
	}

	public Optional<Project> findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	public List<Project> sortBaseduponSomeField(String field) {
		return repo.findAll(Sort.by(Sort.Direction.DESC, field));
	}

	public Page<Project> pageAndSorting(int offset, int pagesize, String field) {
		return repo.findAll(PageRequest.of(offset, pagesize).withSort(Sort.by(Sort.Direction.ASC, field)));
	}

	public Page<Project> getProjectWithPagination(int offset, int pagesize) {
		return repo.findAll(PageRequest.of(offset, pagesize));
	}

	public Optional<Project> getIdByPost(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

}
