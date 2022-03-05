package com.programming.CDI.metier;

import com.programming.CDI.dao.IDao;

public class IMetierImpl implements IMetier{

    private IDao dao;

    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*100/Math.cos(tmp*20);
        return res;
    }
}
