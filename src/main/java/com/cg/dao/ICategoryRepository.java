package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Category;
public interface ICategoryRepository extends JpaRepository<Category, String> {

}
