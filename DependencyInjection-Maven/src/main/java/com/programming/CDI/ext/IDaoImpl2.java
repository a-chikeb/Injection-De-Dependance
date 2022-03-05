package com.programming.CDI.ext;

import com.programming.CDI.dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao")
public class IDaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version V2");
        double temp = 1000;
        return temp;
    }
}
