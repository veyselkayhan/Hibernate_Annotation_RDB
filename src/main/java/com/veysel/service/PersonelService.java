package com.veysel.service;

import com.veysel.repository.PersonRepository;
import com.veysel.repository.entity.Person;
import com.veysel.utility.MyFactoryService;

public class PersonelService extends MyFactoryService<PersonRepository,Person,Long> {


    public PersonelService() {
        super(new PersonRepository());
    }
}
