package com.escuelaing.arsw.taller.relacional.bdRelacional.Jpa.repository;

import com.escuelaing.arsw.taller.relacional.bdRelacional.Jpa.model.CustomerJpa;
import com.escuelaing.arsw.taller.relacional.bdRelacional.jdbc.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerJpa,Long> {
    List<Customer> findByLastName(String lastName);

    Optional<Customer> findById(long id);
}
