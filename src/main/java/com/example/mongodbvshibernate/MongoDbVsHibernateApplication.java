package com.example.mongodbvshibernate;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MongoDbVsHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDbVsHibernateApplication.class, args);



    }



//    @EventListener(ApplicationReadyEvent.class)
//    public void readCSV()
//    {
//        System.out.println("1");
//        List<List<String>> records = new ArrayList<>();
//        try (
//                BufferedReader br = new BufferedReader(new FileReader("C:\\dane\\MOCK_DATA.csv")))
//
//        {
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] values = line.split(System.lineSeparator());
//                records.add(Arrays.asList(values));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("doiszło");
//
//        for(List<String> s : records)
//        {
//            for(String k : s)
//            {
//                System.out.println(k);
//            }
//
//
//
//        }
//
//
//
//}





}
