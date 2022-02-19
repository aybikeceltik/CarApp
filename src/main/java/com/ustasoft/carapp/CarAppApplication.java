package com.ustasoft.carapp;

import com.ustasoft.carapp.entity.Car;
import com.ustasoft.carapp.repository.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class CarAppApplication implements CommandLineRunner {

    private  static final Logger logger = LoggerFactory.getLogger(CarAppApplication.class);

    @Autowired
    private CarRepository carRepository;

    public static void main(String[] args) {

        SpringApplication.run(CarAppApplication.class, args);
        logger.info("Logger test ediyoruz");
    }

    @Override
    public void run(String... args) throws Exception {

        Car car1 = new Car(1,"Ford","Mustang","Red","ADF-1121",2017,new BigDecimal(59000));
        Car car2 = new Car(2,"Nissan","Leaf","White","SSC-3002",2014,new BigDecimal(29000));
        Car car3 = new Car(3,"Toyota","Prives","Silver","KKO-0212",2018,new BigDecimal(30000));

        carRepository.save(car1);
        carRepository.save(car2);
        carRepository.save(car3);




    }
}
