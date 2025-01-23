package com.java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.Entity.PanNum;
@Repository
public interface PanNumRepository extends JpaRepository<PanNum,Integer>{

	PanNum save(int id);

	

}
