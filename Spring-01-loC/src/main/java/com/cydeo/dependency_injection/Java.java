package com.cydeo.dependency_injection;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {

    //@Autowired
    //public Java(OfficeHours officeHours) {    //BUARADAKI ISLEMLERIN YERINE @ALLARGSCONSTRUCTOR
                                                // ANNOTATION UNU KULLANDIK BU KISMI TAM ANLAMADIM? BU LOMBOK OZELLIGI!
     //   this.officeHours = officeHours;
   // }

    OfficeHours officeHours;
   public void getTeachingHours(){
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));
    }
}
