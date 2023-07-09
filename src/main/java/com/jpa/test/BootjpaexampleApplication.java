package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		//creating user objects
//		User user1=new User();
//		user1.setName("Javid Iqbal");
//		user1.setCity("ladakh");
//	    user1.setStatus("i am a java programmer");
//	    User user2=new User();
//		user2.setName("Xaheer Abbass");
//		user2.setCity("ladakh");
//	    user2.setStatus("i am a python programmer");
//	  //  saving multiple users
//	    List<User>users=List.of(user1,user2);
//	   Iterable<User> result=userRepository.saveAll(users);
//	   result.forEach(user->{
//		   System.out.println(user);
//	   });
//	    System.out.println("done");
		//UPDATING THE VALUES IN USER
//		Optional<User> optional=userRepository.findById(53);
//		User user=optional.get();
//		user.setCity("Ladakh");
//		user.setStatus("I am a java programmer");
//		userRepository.save(user);//doubt need to save 
		
		//DELETING THE DATA
	//	userRepository.deleteById(53); //dont need to save
//		Iterable<User>user=userRepository.findAll();
//		userRepository.deleteAll(user);
	   
	   //CUSTOM FINDER METHODS
//	   Iterable<User> users=userRepository.findByName("Javid Iqbal");
//		Iterable<User> users=userRepository.findByNameAndCity("Javid Iqbal","jammu");
//	   users.forEach(user->{
//		   System.out.println(user);
//	   });
	
		 System.out.println("hello");
	}

}
