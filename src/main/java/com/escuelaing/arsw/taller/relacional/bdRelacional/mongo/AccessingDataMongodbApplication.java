package com.escuelaing.arsw.taller.relacional.bdRelacional.mongo;


import com.escuelaing.arsw.taller.relacional.bdRelacional.jdbc.model.Customer;
import com.escuelaing.arsw.taller.relacional.bdRelacional.mongo.repository.CustomerMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

    @Autowired
    private CustomerMongoRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataMongodbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save a couple of customers
        repository.save(new CustomerMongo("Alice", "Smith"));
        repository.save(new CustomerMongo("Bob", "Smith"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (CustomerMongo customer : repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Alice"));

        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (CustomerMongo customer : repository.findByLastName("Smith")) {
            System.out.println(customer);
        }

    }

}