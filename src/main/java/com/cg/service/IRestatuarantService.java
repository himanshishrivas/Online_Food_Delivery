package com.cg.service;

import java.util.Optional;

import com.cg.dao.IRestaurantRepository;

import com.cg.model.Restaurant;
public class IRestatuarantService {
	
	IRestaurantRepository dao;
	

	public Restaurant addRestaurant(Restaurant res) {
		Restaurant restaurant = dao.save(res);
		return restaurant;
		
	}
	

	public Restaurant updateRestaturant(Restaurant res) {
		Restaurant restaurant = dao.save(res);
		return restaurant;
	}
	
//	public Restaurant removeRestaurant(Restaurant res) {
//		Optional<Restaurant> opt = dao.findById(res.getRetaurantId());
//		Restaurant restaurant= dao.findById(opt);
//		return restaurant;
//	}	
		
	public Restaurant removeRestaurant(Restaurant res) {
		
		Restaurant restaurant =null;

			restaurant=(Restaurant) dao.findAll();
		
		 dao.delete(res);
		 return restaurant;
	}
	}
	


