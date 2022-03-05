package com.programming.SDI.pres;

import com.programming.SDI.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotations {
    public static void main(String[] args) {

        //Scan all packages
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.programming.SDI.dao","com.programming.SDI.metier");
        //Second Version
        ApplicationContext applicationContextV2 = new AnnotationConfigApplicationContext("com.programming.SDI.ext","com.programming.SDI.metier");

        //Get me a bean that implements the IMetier Interface
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println(metier.calcul());

        IMetier metierV2 = applicationContextV2.getBean(IMetier.class);
        System.out.println(metierV2.calcul());
    }
}
