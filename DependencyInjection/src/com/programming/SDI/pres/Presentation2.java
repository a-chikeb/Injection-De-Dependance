package com.programming.SDI.pres;

import com.programming.SDI.dao.IDao;
import com.programming.SDI.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Scanner sc = new Scanner(new File("./src/com/programming/SDI/config.txt"));

        String daoClassName = sc.nextLine();

        //Class<?> cDao = Class.forName(daoClassName);
        Class<?> cDao = Class.forName(daoClassName);

        if(implementInterface("com.programming.SDI.dao.IDao",cDao)){
            IDao dao =(IDao) cDao.newInstance();
            //System.out.println(dao.getData());

            //Metier
            String metierClassName = sc.nextLine();
            Class<?> cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.newInstance();
            Method method = cMetier.getMethod("setDao",IDao.class);

            method.invoke(metier,dao);

            System.out.println("Resultat: "+metier.calcul());
        }else{
            System.out.println("Class "+daoClassName+" n'implemente pas IDao");
        }


    }

    //interface com.programming.SDI.dao.IDao
    public static boolean implementInterface(String interfaceName,Class<?> cDao){

        for (Class<?> anInterface : cDao.getInterfaces()) {
            if(anInterface.toString().contains(interfaceName))
                return true;
        }
        return false;
    }
}
