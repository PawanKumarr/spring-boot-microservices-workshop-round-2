package org.pawan.department.repository;

import org.pawan.department.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
    Department findByDepartmentId(Long id);
}
