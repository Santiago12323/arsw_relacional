package com.escuelaing.arsw.taller.relacional.bdRelacional.mongo.repository;

import com.escuelaing.arsw.taller.relacional.bdRelacional.mongo.CustomerMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerMongoRepository extends MongoRepository<CustomerMongo, String> {
    List<CustomerMongo> findByFirstName(String firstName);
    List<CustomerMongo> findByLastName(String lastName);

}
