package com.veysel.repository;

import com.veysel.repository.entity.Person;
import com.veysel.utility.MyFactoryRepository;

public class PersonelRepository extends MyFactoryRepository <Person,Long>{
    public PersonelRepository() {
        super(new Person());
    }
}
