package com.jpa.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.test.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	//CUSTOM FINDER MET
public Iterable<User>findByName(String name);
public Iterable<User>findByNameAndCity(String name,String city);
	
	//JPQL AND NATIVE QUERIES
 @Query("select u FROM User u")
 public Iterable<User>getAllUser();
 @Query("select u From User u WHERE u.name=:n and u.city=:c")
 public Iterable<User>getUserByNameAndCity(@Param("n")String name,@Param("c")String city);
 @Query(value="select * from user",nativeQuery=true)
 public Iterable<User>getUsers();
 
}
