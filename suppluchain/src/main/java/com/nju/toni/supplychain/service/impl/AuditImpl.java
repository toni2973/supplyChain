package com.nju.toni.supplychain.service.impl;

import com.nju.toni.supplychain.DAO.AuditDAO;
import com.nju.toni.supplychain.DAO.ProductionDAO;
import com.nju.toni.supplychain.DAO.ProductionVersionDAO;
import com.nju.toni.supplychain.DAO.ValidateProductionDAO;
import com.nju.toni.supplychain.entity.*;
import com.nju.toni.supplychain.po.ProductionPO;
import com.nju.toni.supplychain.po.ProductionVersionPO;
import com.nju.toni.supplychain.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by toni on 4/19/17.
 */
public class AuditImpl implements AuditService {
    @Autowired
    AuditDAO auditDAO;
    @Autowired
    ProductionDAO productionDAO;
    @Autowired

    ValidateProductionDAO validateProductionDAO;
    @Autowired
    ProductionVersionDAO productionVersionDAO;
    @Override
    public Audit login(String username, String password) {
        return null;
    }

    @Override
    public Result validateProduction(long auditID, Production production, Result result) {
        ValidateProductionPO validateProduction=new ValidateProductionPO();
        validateProduction.setValiTime(utils.getCurrentTime());
        validateProduction.setAuditID(auditID);
        validateProduction.setProductionID(production.getID());
        validateProduction.setComment(result.getMessage());
        validateProduction.setValidate(result.getValidate().toString());
        long validateProductionID=validateProductionDAO.insertValidateProduction(validateProduction);
        ProductionPO productionPO= utils.convert(production);
        productionPO.setValidate(result.getValidate().toString());
        productionPO.setValidateID(validateProductionID);

        if (result.getValidate()==Validate.SUCCESS) {
            ProductionVersionPO productionVersion = utils.convert(productionPO);
            String version = utils.newVersion();
            productionVersion.setVersion(version);
            long productionVersionID = productionVersionDAO.insertProductionVersion(productionVersion);
            productionPO.setLatestVersion(productionVersionID);
        }


        int count = productionDAO.updateProduction(productionPO);
        return utils.upsdateReuslt(count);


    }

    @Override
    public List<Production> getNoValidateProduction() {
        return null;
    }

    @Override
    public List<Production> getAllProduction() {
        return null;
    }

    @Override
    public List<Production> getValidateProduction() {
        return null;
    }
}
