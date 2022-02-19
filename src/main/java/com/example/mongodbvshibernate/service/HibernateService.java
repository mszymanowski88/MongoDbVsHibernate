package com.example.mongodbvshibernate.service;

import java.io.IOException;

public interface HibernateService {

    void saveToHibernate() throws IOException;

    void readFromHibernate();
}
