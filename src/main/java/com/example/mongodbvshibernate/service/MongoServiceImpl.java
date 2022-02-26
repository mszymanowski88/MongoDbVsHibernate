package com.example.mongodbvshibernate.service;

import com.example.mongodbvshibernate.apect.TimedMongo;
import com.example.mongodbvshibernate.daomongo.MongoRepo;
import com.example.mongodbvshibernate.utils.CsvFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MongoServiceImpl implements MongoService {

    private final MongoRepo mongoRepo;
    private final CsvFileReader csvFileReader;

    @Autowired
    public MongoServiceImpl(MongoRepo mongoRepo, CsvFileReader csvFileReader) {
        this.csvFileReader = csvFileReader;
        this.mongoRepo = mongoRepo;
    }


    @Override
    @TimedMongo
    @EventListener(ApplicationReadyEvent.class)
    public void saveToMongo() throws IOException {


        mongoRepo.saveAll(csvFileReader.listFromFile());

    }

    @Override

    public void readFromMongo() {

        mongoRepo.findAll();


    }


}
