package com.escuelaing.arsw.taller.relacional.bdRelacional.Jpa.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Customer")
public class CustomerJpa {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    public CustomerJpa(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
