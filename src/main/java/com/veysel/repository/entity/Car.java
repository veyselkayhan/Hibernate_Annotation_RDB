package com.veysel.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String plate;
    String name;
    Boolean isActive;


}
