package com.example.mongodbvshibernate.service;

import java.io.IOException;

public interface MongoService {

    void saveToMongo() throws IOException;

    void readFromMongo();
}
