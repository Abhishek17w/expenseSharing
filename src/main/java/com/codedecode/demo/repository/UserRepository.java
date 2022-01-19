package com.codedecode.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.codedecode.demo.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User,String>{
	
}
