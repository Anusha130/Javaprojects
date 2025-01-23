package com.java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.Entity.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person,Integer>{

	Person save(Long id);

	

	

}
