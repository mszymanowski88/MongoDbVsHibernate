package com.example.mongodbvshibernate.apect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Aspect
@Component
public class TimeSchedulerMongo {

    private static Instant start;

    @Before("@annotation(com.example.mongodbvshibernate.apect.TimedMongo)")
    public void startCount() {
        start = Instant.now();

    }

    @After("@annotation(com.example.mongodbvshibernate.apect.TimedMongo)")
    public void stopCount() {

        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("Mongo saved data in : " + timeElapsed);
    }
}
