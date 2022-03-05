package com.programming.CDI.ext;

import com.programming.CDI.dao.IDao;

public class IDaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version 2");
        double res = 100;
        return res;
    }
}
