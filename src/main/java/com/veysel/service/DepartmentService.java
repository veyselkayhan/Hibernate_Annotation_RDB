package com.veysel.service;

import com.veysel.repository.DepartmentRepository;
import com.veysel.repository.entity.Department;
import com.veysel.utility.MyFactoryService;

public class DepartmentService extends MyFactoryService<DepartmentRepository,Department,Long> {

    DepartmentRepository departmentRepository;

    public DepartmentService() {
        super(new DepartmentRepository());
    }
}
