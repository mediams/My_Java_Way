package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {

        //Creating Spring IOC Container
        //Read the configuration class
        //Create and manage the Spring beans
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //Retrieve Spring Beans from Spring IOC Container
        Car car = context.getBean(Car.class);
        car.move();

        Bike bean = context.getBean(Bike.class);
        bean.move();

        Traveler traveler = context.getBean(Traveler.class);
        traveler.startJourney();


    }
}
