package com.cydeo.controller;

import com.cydeo.Model.Employee;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/employees")
    public String emplist(Model model){

        //database' api' random data generator
        List<Employee> employeeList = new ArrayList<>();
        Faker faker = new Faker();
        employeeList.add(new Employee(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(50000,140000)));
        employeeList.add(new Employee(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(50000,140000)));
        employeeList.add(new Employee(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(50000,140000)));
        employeeList.add(new Employee(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(50000,140000)));

        //model.addAttribute("name","MIKE");
        model.addAttribute("employees",employeeList);

        return "employee-list.html";

    }

    @RequestMapping("/employee-info")
    public String empInfo(Model model){

        //creating  one object from employee class and assigning values
        Employee emp1 = new Employee("Joe", "Smith", 90000);

        //passing our object to model
        model.addAttribute("emp",emp1);

        return "/employee-info.html";

    }
}
