package com.veysel.repository;

import com.veysel.repository.entity.Department;
import com.veysel.utility.MyFactoryRepository;

public class DepartmentRepository extends MyFactoryRepository <Department,Long>{

    public DepartmentRepository() {
        super(new Department());
    }
}
