package com.jpa.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.test.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	//CUSTOM FINDER MET
public Iterable<User>findByName(String name);
public Iterable<User>findByNameAndCity(String name,String city);
}
