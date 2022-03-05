package com.programming.CDI.metier;

import com.programming.CDI.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier2")
public class IMetierImpl implements IMetier {


    private IDao dao2;

    @Autowired
    public IMetierImpl(IDao dao) {
        this.dao2 = dao;
    }

    @Override
    public double calcul() {
        double tmp = dao2.getData();
        double res = tmp*100/Math.cos(tmp*Math.PI);
        return res;
    }

}
