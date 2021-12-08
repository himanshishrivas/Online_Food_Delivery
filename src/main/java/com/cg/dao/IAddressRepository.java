package com.cg.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Address;
public interface IAddressRepository extends JpaRepository<Address, String> {

}
