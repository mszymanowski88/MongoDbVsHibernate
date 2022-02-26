package com.example.mongodbvshibernate.utils;

import com.example.mongodbvshibernate.daohibernate.HibernateRepo;
import com.example.mongodbvshibernate.peoplemodel.Person;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class CsvFileReader {

    private final HibernateRepo hibernateRepo;

    @Autowired
    public CsvFileReader(HibernateRepo hibernateRepo) {
        this.hibernateRepo = hibernateRepo;
    }

    public Reader readCsv() throws FileNotFoundException {

        return new BufferedReader(new FileReader("src/main/resources/MOCK_DATA.csv"));

    }


    public List<Person> listFromFile() throws IOException {

        List<Person> resultFromFile = new ArrayList<>();

        CSVParser csvParser = new CSVParser(readCsv(), CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
        Iterable<CSVRecord> csvRecords = csvParser.getRecords();
        for (CSVRecord csvRecord : csvRecords) {
            Person person = new Person(
                    Long.parseLong(csvRecord.get("id")),
                    csvRecord.get("first_name"),
                    csvRecord.get("last_name"),
                    csvRecord.get("email"),
                    csvRecord.get("gender")


            );


            resultFromFile.add(person);


        }
        return resultFromFile;
    }


}





