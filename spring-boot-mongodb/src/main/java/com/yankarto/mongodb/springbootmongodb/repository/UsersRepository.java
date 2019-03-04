package com.yankarto.mongodb.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yankarto.mongodb.springbootmongodb.document.Users;

public interface UsersRepository extends MongoRepository<Users,Integer>{

}
