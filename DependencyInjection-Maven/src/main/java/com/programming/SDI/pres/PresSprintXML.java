package com.programming.SDI.pres;

import com.programming.SDI.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSprintXML {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier = (IMetier) applicationContext.getBean("metier");
        System.out.println("Resultat => "+metier.calcul());


    }
}
