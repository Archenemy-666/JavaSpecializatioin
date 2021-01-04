package com.dao;

import com.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDao {
    @Autowired
    EmployeeRepository employeeRepository;
    public List getEmployees(){
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }
    public void setEmployees(List<Employee> employeeList){
        employeeRepository.saveAll(employeeList);
    }
    public void employeeRegister(Employee employee){
        employeeRepository.save(employee);
    }
    public Employee getEmployeeById(Integer emplyeeId){
        Employee employee = employeeRepository.findById(emplyeeId).orElse(new Employee());
        return employee ;
    }
    public Employee getEmployeeByName(String employeeName){
        Employee employee = employeeRepository.findByEmployeeName(employeeName).orElse(new Employee());
        return employee ;
    }
    public List<Employee> getSortedEmployees(){
        List<Employee> employeeList = employeeRepository.findAllSorted();
        return employeeList ;
    }

}
