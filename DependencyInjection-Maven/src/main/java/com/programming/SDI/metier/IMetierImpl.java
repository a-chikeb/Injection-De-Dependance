package com.programming.SDI.metier;

import com.programming.SDI.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IMetierImpl implements IMetier{

    @Autowired
    private IDao dao;


    /*public IMetierImpl(IDao dao) {
        this.dao = dao;
    }*/

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*100/Math.cos(tmp*Math.PI);
        return res;
    }

    public void setDao(IDao dao){
        this.dao = dao;
    }
}
