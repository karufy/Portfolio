package org.ochiugo.casestudy.modelentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//jpa entity
// Use Lombok to generate constructors, getters and setters
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Software {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private String company;
    private String price;
}
