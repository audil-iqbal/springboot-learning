package com.example.helloworld;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "employees",collectionResourceRel = "employees")
public interface EmployeesRepo extends JpaRepository<Employees,Integer> {
}
