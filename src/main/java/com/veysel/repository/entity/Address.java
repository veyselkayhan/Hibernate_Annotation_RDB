package com.veysel.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_adress")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String name;

    String city;

    Integer zipCode;

    String street;

    Integer number;


//    @ManyToOne
//    Person person;

    @ManyToMany
    @JoinTable(
            name = "tbl_person_address",
            joinColumns = {@JoinColumn(name = "adres_id")},
            inverseJoinColumns = {@JoinColumn(name = "personel_id")}
    )
    List<Person> personList;

}

