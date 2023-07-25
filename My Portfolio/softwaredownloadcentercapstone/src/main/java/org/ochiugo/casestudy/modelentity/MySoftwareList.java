package org.ochiugo.casestudy.modelentity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;






@Entity
@Table(name="MySoftwares")
@Getter
@Setter
public class MySoftwareList {


    @Id
    private int id;
    private String name;
    private String company;
    private String price;
    public MySoftwareList() {
        super();
        // TODO Auto-generated constructor stub
    }
    public MySoftwareList(int id, String name, String company, String price) {
        super();
        this.id = id;
        this.name = name;
        this.company = company;
        this.price = price;
}
}