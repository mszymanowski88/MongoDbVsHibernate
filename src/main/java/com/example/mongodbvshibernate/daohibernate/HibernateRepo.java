package com.example.mongodbvshibernate.daohibernate;

import com.example.mongodbvshibernate.peoplemodel.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HibernateRepo extends JpaRepository<Person, Long> {
}
