package com.cydeo.controller;

import com.cydeo.Model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/employees")
    public String emplist(Model model){

        model.addAttribute("name","MIKE");

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
