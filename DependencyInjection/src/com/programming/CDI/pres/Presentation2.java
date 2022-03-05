package com.programming.CDI.pres;

import com.programming.CDI.dao.IDao;
import com.programming.CDI.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;


public class Presentation2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, FileNotFoundException {
        Scanner sc = new Scanner(new File("./src/com/programming/CDI/config.txt"));
        String daoClassName = sc.nextLine();

        Class<?> cDao = Class.forName(daoClassName);

        if(implementInterface("com.programming.CDI.dao.IDao",cDao)){

            IDao dao = (IDao) cDao.newInstance();

            String metierClassName = sc.nextLine();

            Class<?> cMetier = Class.forName(metierClassName);

            Constructor<?> conIMetier = cMetier.getConstructor(IDao.class);

            IMetier metier = (IMetier) conIMetier.newInstance(dao);

            System.out.println("Resultat: "+metier.calcul());


        }else{
            System.out.println("Class "+daoClassName+" n'implemente pas IDao");
        }

    }

    public static boolean implementInterface(String interfaceName,Class<?> cDao){

        for (Class<?> anInterface : cDao.getInterfaces()) {
            if(anInterface.toString().contains(interfaceName))
                return true;
        }
        return false;
    }
}
