package com.veysel.repository;

import com.veysel.repository.entity.Person;
import com.veysel.utility.MyFactoryRepository;

public class PersonRepository extends MyFactoryRepository <Person,Long>{
    public PersonRepository() {
        super(new Person());
    }
}
