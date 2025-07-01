package com.escuelaing.arsw.taller.relacional.bdRelacional.mongo;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerMongo {
    @Id
    private String id;
    private String firstName;
    private String lastName;

    public CustomerMongo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
