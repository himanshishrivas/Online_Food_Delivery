package com.cg.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.Restaurant;


public interface IRestaurantRepository extends JpaRepository<Restaurant, String> {

}
