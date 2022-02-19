package com.example.mongodbvshibernate.service;

import com.example.mongodbvshibernate.apect.TimedHibernate;
import com.example.mongodbvshibernate.daohibernate.HibernateRepo;
import com.example.mongodbvshibernate.peoplemodel.Person;
import com.example.mongodbvshibernate.utils.CsvFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class HibernatateServiceImpl implements HibernateService {

    private final HibernateRepo hibernateRepo;
    private final CsvFileReader csvFileReader;


    @Autowired
    public HibernatateServiceImpl(HibernateRepo hibernateRepo, CsvFileReader csvFileReader) {
        this.hibernateRepo = hibernateRepo;
        this.csvFileReader = csvFileReader;
    }
    @Override
    @TimedHibernate
    @EventListener(ApplicationReadyEvent.class)
    public void saveToHibernate() throws IOException {

        for (Person personToSave : csvFileReader.listFromFile1()) {
            hibernateRepo.save(personToSave);

        }
    }

    @Override

    public void readFromHibernate() {

        hibernateRepo.findAll();


    }

}
