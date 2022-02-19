package com.example.mongodbvshibernate.daomongo;

import com.example.mongodbvshibernate.peoplemodel.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepo extends MongoRepository<Person, Long> {
}
