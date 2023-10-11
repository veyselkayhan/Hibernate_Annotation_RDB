package com.veysel;

import com.veysel.repository.AddressRepository;
import com.veysel.repository.DepartmentRepository;
import com.veysel.repository.PersonRepository;
import com.veysel.repository.entity.Address;
import com.veysel.repository.entity.Department;
import com.veysel.repository.entity.Person;
import com.veysel.service.DepartmentService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        DepartmentService departmentService = new DepartmentService();



        Department department = Department.builder()
                .name("İnsan Kaynakları Dölümü")
                .build();

        Person person1 = Person.builder()
                .name("Aydan")
                .department(department)
                .age(34)
                .build();

        Person person2 = Person.builder()
                .name("Ceren")
                .department(department)
                .age(29)
                .build();

        Person person3 = Person.builder()
                .name("Emre")
                .department(department)
                .age(25)
                .build();

        new PersonRepository().save(person1);
        new PersonRepository().save(person2);
        new PersonRepository().save(person3);
//



    }


    private static void  Person_Address(){
        Address address1 = Address.builder()
                .name("EV")
                .city("Ankara")
                .build();
        Address address2 = Address.builder()
                .name("YAZLIK")
                .city("İzmir")
                .build();
        Address address3 = Address.builder()
                .name("DİĞER")
                .city("Sinop")
                .build();
        new AddressRepository().save(address1);
        new AddressRepository().save(address2);

        Person person = Person.builder()
                .name("Muhammet")
                .age(40)
                .addressList(List.of(address1,address2))
                .build();
        new PersonRepository().save(person);

        Person person2 = Person.builder()
                .name("Demet")
                .age(35)
                .addressList(List.of(address1,address2,address3))
                .build();
        new PersonRepository().save(person2);
    }
    private static void Personel_Departman(){
        Department departmentSatis = Department.builder()
                .name("Satış Departmanı")
                .build();
        Department departmentMuhasebe = Department.builder()
                .name("Muhasebe Departmanı")
                .build();

        new DepartmentRepository().save(departmentMuhasebe);
        new DepartmentRepository().save(departmentSatis);

        Person person1 = Person.builder()
                .age(32)
                .name("Hakan TEKİN")
                .department(departmentSatis)
                .build();
        Person person2 = Person.builder()
                .age(28)
                .name("Bahar TAŞKIN")
                .department(departmentMuhasebe)
                .build();
        Person person3 = Person.builder()
                .age(45)
                .name("Hakkı TAŞ")
                .department(departmentSatis)
                .build();

        new PersonRepository().save(person1);
        new PersonRepository().save(person2);
        new PersonRepository().save(person3);
    }


}