package com.cydeo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/emplooyes")
    public String emp(){
        return "emplooyes.html";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome.html";
    }

    @RequestMapping("/")
    public String home(){
        return "home.html";
    }

}
