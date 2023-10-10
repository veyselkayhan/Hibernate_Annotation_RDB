package com.veysel;

import com.veysel.repository.AddressRepository;
import com.veysel.repository.DepartmentRepository;
import com.veysel.repository.PersonelRepository;
import com.veysel.repository.entity.Address;
import com.veysel.repository.entity.Department;
import com.veysel.repository.entity.Person;
import org.hibernate.collection.internal.PersistentList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Department departmentSatıs= Department.builder()
//                .name("Satış")
//                .build();
//
//        Department departmentMuhasebe=Department.builder()
//                .name("Muhasebe")
//                .build();
//
//        new DepartmentRepository().save(departmentSatıs);
//        new DepartmentRepository().save(departmentMuhasebe);
//
//
//        Person person1= Person.builder()
//                .age(32)
//                .name("Hakan Tekir")
//                .department(departmentSatıs)
//                .build();
//
//        Person person2= Person.builder()
//                .age(28)
//                .name("Bahar Taşkın")
//                .department(departmentMuhasebe)
//                .build();
//
//        Person person3=Person.builder()
//                .age(45)
//                .name("Hakkı Taş")
//                .department(departmentSatıs)
//                .build();
//
//        new PersonelRepository().save(person1);
//        new PersonelRepository().save(person2);
//        new PersonelRepository().save(person3);


        Person person1=new PersonelRepository().findByID(1L).get();
        Person person3=new PersonelRepository().findByID(3L).get();

        Address address1= Address.builder()
                .name("Ev Adresi")
                .city("Ankara")
                .build();

        Address address2=Address.builder()
                .name("Yazlık Adresi")
                .city("Antalya")
                .build();

        Address address3=Address.builder()
                .name("Diger Adres")
                .city("Artvin")
                .build();

        new AddressRepository().save(address1);
        new AddressRepository().save(address2);
        new AddressRepository().save(address3);

        person1.setAddressList(Arrays.asList(address1,address3));
        person3.setAddressList(Arrays.asList(address1,address2,address3));

        new PersonelRepository().update(person1);
        new PersonelRepository().update(person3);













        // TODO 16:34 den sonrasına bak


//        Optional<Department> department= new DepartmentRepository().findByID(1L);
//        System.out.println("--------------");
//        System.out.println("--------------");
//        List<Person>personList=new PersonelRepository().findAll();
//
//        System.out.println("Bitti");




    }


}