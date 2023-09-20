package com.cydeo.service;

import com.cydeo.respository.JavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")   //BU ANNATOTION U EKLEYINCE System.out.println(java1 == java2) SONUCU FALSE GELDI.
                        // BUNU YAZMADAN ONCE JAVA1=JAVA 2 TRUE CIKIYORDU.
                        // EAGER TEST I YAZDIRDIKTAN SONRA KALDIRMAK ICIN @LAZY kullandik

@Lazy //BUNU KULLANINCA Eager Test KALDIRMIS OLDUK
@Component
public class JavaService {

    //private final ExtraSessions extraSessions;
    private final ExtraSessions officeHours;
    private final ExtraSessions mentoringHours;
    private final JavaRepository javaRepository;

/*
    @Autowired
    //public JavaService(@Qualifier("officeHoursService") ExtraSessions extraSessions, JavaRepository javaRepository){
      public JavaService(@Qualifier("Mentor") ExtraSessions extraSessions, JavaRepository javaRepository){
        this.extraSessions = extraSessions;
        this.javaRepository = javaRepository;
    }

 */

    public JavaService(@Qualifier("Office") ExtraSessions officeHours, @Qualifier("Mentor") ExtraSessions mentoringHours, JavaRepository javaRepository) {
        this.officeHours = officeHours;
        this.mentoringHours = mentoringHours;
        this.javaRepository = javaRepository;

        System.out.println("Eager Test"); //CydeoApp dakileri kaldirdik, calistirdigimizda bu kismi yazdirir.
    }

    public void getTeachingHours(){

        System.out.println("Weekly Java Hours: " + (javaRepository.returnHours() + officeHours.getHours() + mentoringHours.getHours()));
    }


}
