package com.escuelaing.arsw.taller.relacional.bdRelacional.jdbc.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private long id;
    private String firstName, lastName;
}
