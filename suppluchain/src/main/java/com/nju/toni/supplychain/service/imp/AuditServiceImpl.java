package com.nju.toni.supplychain.service.imp;

import com.nju.toni.supplychain.DAO.ProductionDAO;
import com.nju.toni.supplychain.DAO.ValidateProductionDAO;
import com.nju.toni.supplychain.entity.Audit;
import com.nju.toni.supplychain.entity.Production;
import com.nju.toni.supplychain.entity.ValidateProductionPO;
import com.nju.toni.supplychain.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by toni on 3/23/17.
 */


@Service("AuditService")
public class AuditServiceImpl implements AuditService {

    @Autowired
    ProductionDAO productionDAO;

    @Autowired
    ValidateProductionDAO validateProductionDAO;
    @Override
    public Audit login(String username, String password) {
        return login(username,password);
    }

    @Override
    public void validateProduction(Audit audit,Production production,boolean result,String comment) {


        ValidateProductionPO validateProduction=new ValidateProductionPO();
        validateProduction.setResult(result);
        validateProduction.setComment(comment);
        validateProduction.setAuditID(audit.getID());
        validateProduction.setProductionID(production.getID());
        validateProduction.setValiTime(System.currentTimeMillis()/1000);
        int ID= validateProductionDAO.insertValidateProduction(validateProduction);

        production.setID(ID);
        int validate=-1;
        if (result==true) validate=1;
        production.setValidate(validate);
        productionDAO.updateProduction(production);

    }

    @Override
    public List<Production> getNoValidateProduction() {
        return productionDAO.getNoValidateProduction();
    }

    @Override
    public List<Production> getAllProduction() {
        return productionDAO.getAllProduction();
    }

    @Override
    public List<Production> getValidateProduction() {

        return null;
    }
}
