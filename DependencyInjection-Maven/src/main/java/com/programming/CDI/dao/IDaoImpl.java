package com.programming.CDI.dao;

import org.springframework.stereotype.Component;


@Component("dao2")
public class IDaoImpl implements IDao {

    @Override
    public double getData() {
        double temp = Math.random()*40;
        return temp;
    }

}
