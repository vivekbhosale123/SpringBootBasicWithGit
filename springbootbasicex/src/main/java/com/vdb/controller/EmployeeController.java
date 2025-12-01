package com.vdb.controller;


import com.vdb.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
public class EmployeeController {

    private List<Employee> employeeList = Stream.of(new Employee(1, "vivek", "Pune"),
            new Employee(2, "ganesh", "Latur"),
            new Employee(3, "Rahul", "Nagar"),
            new Employee(4, "Motilal", "Solapur")).toList();

    @GetMapping("/findall")
    public ResponseEntity<List<Employee>> findAll()
    {
        return ResponseEntity.ok(employeeList);
    }

}
