package com.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer> {

	Project save(int id);
	//Project DeleteByName(String name);

}
