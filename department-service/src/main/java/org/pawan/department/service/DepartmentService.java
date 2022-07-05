package org.pawan.department.service;

import org.pawan.department.entity.Department;
import org.pawan.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartment(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
