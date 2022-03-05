package com.programming.SDI.ext;

import com.programming.SDI.dao.IDao;

public class IDaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version V2");
        double temp = 1000;
        return temp;
    }
}
