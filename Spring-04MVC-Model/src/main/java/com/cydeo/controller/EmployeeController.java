package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping("/new")  //localhost:8080/employee/new?firstName=Joe
    public String getInfo(@RequestParam (required = false, defaultValue = "TEST")String firstName, Model model){ //Daha once model araciligiyla data da veri
                                                                                                                // alirken @Request param ile musterinin
                                                                                                                // girmis oldugu veri data ya islenip controllerda
                                                                                                                // kullanilir hale gelmis oluyor.@RequestParam ile
                                                                                                                // musterinin girdigi veri(Joe) alinip model araciligiyle
                                                                                                                // tekrar ekrana yazdirilmis olur. Burada (required = false, defaultValue = "TEST")
                                                                                                                // yazmamizdaki amac; //localhost:8080/employee/new kismini girdigimizde "Whitelabel Error Page"
                                                                                                                // sayfasi ile karsilasmaiz. required = false kismini
                                                                                                                // isledigimizde ekrana "New Employee" gelirken, (required = false, defaultValue = "TEST")
                                                                                                                // isledigimizde ekrana "New Employee TEST" ile birlikte adres
                                                                                                                // cubugune veri girildiginde de ekranda goruntulenme imkani veriri


        System.out.println(firstName);
        model.addAttribute("fname",firstName);

        return "emp-register.html";

    }
    @RequestMapping("/add/{firstName}/{lastName}")      //localhost:8080/employee/add/Joe/Smith
    public String getInfo2(@PathVariable String firstName,@PathVariable String lastName, Model model){ //Buradaki @PathVariable
                                                                                                       // sayasinde adres cubuguna yazilan verileri oruntuleyebiliyoruz

        model.addAttribute("fname",firstName);
        model.addAttribute("lname", lastName);

        return "emp-register.html";
    }

}
