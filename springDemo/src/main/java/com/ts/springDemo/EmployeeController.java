package com.ts.springDemo;

import com.dao.EmployeeDao;
import com.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;

    @RequestMapping("/requestEmployee")
    public void employeeRegister(Employee employee){
        employeeDao.employeeRegister(employee);
    }
    @RequestMapping("/registerAllEmployees")
    public List<Employee> registerAllEmployees(){
        Employee employee1 = new Employee(1 , "sid" , "sid@qwe.com" , "sid123" ,"password",new Date(),"India",772737717);
        Employee employee2 = new Employee(2 , "sai" , "sai@qwe.com" , "sai123" ,"password",new Date(),"India",772737712);
        Employee employee3 = new Employee(3 , "sia" , "sia@qwe.com" , "sia123" ,"password",new Date(),"India",772737722);
        Employee employee4 = new Employee(4 , "anu" , "abu@qwe.com" , "anu123" ,"password",new Date(),"India",772737733);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeDao.setEmployees(employeeList);
        return showAllEmployees();
    }

    @RequestMapping("/showAllEmployees")
    public List<Employee> showAllEmployees() {
        List<Employee> employeeList = employeeDao.getEmployees();
        return employeeList ;
    }
    @RequestMapping("/showEmployeeById/{employeeId}")
    public Employee showEmployeeById(@PathVariable("employeeId") Integer employeeId){
        Employee employee = employeeDao.getEmployeeById(employeeId);
        return employee ;
    }

    @RequestMapping("/showEmployeeByName/{employeeName}")
    public Employee showEmployeesByName(@PathVariable("employeeName") String employeeName){
        Employee employee = employeeDao.getEmployeeByName(employeeName);
        return employee ;
    }


}
