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
@Table(name = "tbl_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;

    String name;

    /*
    Lazy loading
    Eager loading


     */

    @OneToMany(mappedBy = "department",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    List<Person> personList;
}
