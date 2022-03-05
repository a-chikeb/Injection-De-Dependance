package com.programming.CDI.pres;

import com.programming.CDI.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSprintXML {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext2.xml");
        IMetier metier = (IMetier) applicationContext.getBean("metier2");
        System.out.println("Resultat => "+metier.calcul());


    }
}
