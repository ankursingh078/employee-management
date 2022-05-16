package com.example.service;

import com.example.exception.EmployeeException;
import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployeeDetailsById(Integer empId) {
        try {
            return employeeRepository.findById(empId).get();
        } catch (Exception e) {
            throw new EmployeeException("Employee not found with this Employee ID");
        }
    }

    public Employee saveEmployeeDetails(Employee employee) throws EmployeeException {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void deleteEmployeeById(Integer empId) {
        try {
            employeeRepository.deleteById(empId);
        } catch (Exception e) {
            throw new EmployeeException("Employee to be deleted Not found in Database");
        }

    }
}
