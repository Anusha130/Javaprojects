package com.profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Courserepositorye extends JpaRepository<Course,Integer> {

}
