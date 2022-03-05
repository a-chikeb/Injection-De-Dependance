package com.programming.SDI.dao;

public class IDaoImpl implements IDao{

    @Override
    public double getData() {
        double temp = Math.random()*40;
        return temp;
    }

}
