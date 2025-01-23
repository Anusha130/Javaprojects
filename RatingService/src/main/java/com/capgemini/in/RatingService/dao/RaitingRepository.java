package com.capgemini.in.RatingService.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.in.RatingService.entity.Rating;
@Repository
public interface RaitingRepository extends CrudRepository<Rating,String>{
	List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);
	
}