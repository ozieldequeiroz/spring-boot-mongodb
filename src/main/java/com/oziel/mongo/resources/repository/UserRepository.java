package com.oziel.mongo.resources.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.oziel.mongo.domain.User;
/*Função foi adicionada fora do projeto*/
@Repository
public interface UserRepository extends MongoRepository<User, String> {

	List<User> findAll();

}
