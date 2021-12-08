package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Item;
public interface IItemRepository extends JpaRepository<Item, String> {

}
