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
@Table(name = "tbl_person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;
    String name;
    Integer age;

    /*
    bir personelin çalıştığı department bilgisini nasıl çekeriz?

    Lazy    ->

    Eager   ->
     */
    @ManyToOne(fetch =FetchType.EAGER)
    Department department;

    @OneToMany
//    @JoinTable(name =" tbl_personel_adres",
//    joinColumns = @JoinColumn(name = "Personelid"),
//    inverseJoinColumns = @JoinColumn(name = "addressid")
//    )
    List<Address> addressList;

    @Override
    public String toString() {
        return "[Username]= "+name +" | [AGE] "+age;
    }
}
