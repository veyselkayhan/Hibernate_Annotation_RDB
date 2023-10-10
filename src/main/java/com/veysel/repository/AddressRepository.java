package com.veysel.repository;

import com.veysel.repository.entity.Address;
import com.veysel.utility.MyFactoryRepository;

public class AddressRepository extends MyFactoryRepository<Address,Long> {
    public AddressRepository() {
        super(new Address());
    }
}
