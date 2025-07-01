package com.escuelaing.arsw.taller.relacional.bdRelacional.Jpa;

import com.escuelaing.arsw.taller.relacional.bdRelacional.Jpa.model.CustomerJpa;
import com.escuelaing.arsw.taller.relacional.bdRelacional.Jpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import org.springframework.boot.CommandLineRunner;

import java.util.List;

@SpringBootApplication
public class prueba implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(prueba.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // 1. Insertar 3 clientes
        CustomerJpa c1 = new CustomerJpa("Ana", "Gomez");
        CustomerJpa c2 = new CustomerJpa("Luis", "Perez");
        CustomerJpa c3 = new CustomerJpa("Marta", "Diaz");

        customerRepository.save(c1);
        customerRepository.save(c2);
        customerRepository.save(c3);

        System.out.println("Clientes insertados:");
        customerRepository.findAll().forEach(System.out::println);

        // 2. Actualizar uno (cambiar apellido de Luis)
        c2.setLastName("Rodriguez");
        customerRepository.save(c2);

        System.out.println("\nCliente actualizado (Luis):");
        System.out.println(customerRepository.findById(c2.getId()).orElse(null));

        // 3. Leer todos
        System.out.println("\nTodos los clientes:");
        List<CustomerJpa> clientes = customerRepository.findAll();
        clientes.forEach(System.out::println);

        // 4. Eliminar uno (Marta)
        customerRepository.delete(c3);

        System.out.println("\nClientes después de eliminar a Marta:");
        customerRepository.findAll().forEach(System.out::println);
    }
}


