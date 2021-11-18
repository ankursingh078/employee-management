package com.example.controller;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This controller is used to perform CRUD operations on Employees
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/emp/{empId}")
    public ResponseEntity<Employee> getEmployeeDetailsById(@PathVariable("empId") Integer empId) {
        Employee employee = employeeService.getEmployeeDetailsById(empId);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployeeDetails(@RequestBody Employee employee) {
        Employee employeeSaved = employeeService.saveEmployeeDetails(employee);
        return new ResponseEntity<>(employeeSaved, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<Void> deleteEmployeeById(@PathVariable Integer empId) {
        employeeService.deleteEmployeeById(empId);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
