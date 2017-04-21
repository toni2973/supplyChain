package com.nju.toni.supplychain.service.imp;

import com.nju.toni.supplychain.DAO.ApplyMaterialDAO;
import com.nju.toni.supplychain.DAO.CompanyDAO;
import com.nju.toni.supplychain.DAO.MaterialListDAO;
import com.nju.toni.supplychain.DAO.ProductionDAO;
import com.nju.toni.supplychain.entity.*;
import com.nju.toni.supplychain.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

/**
 * Created by toni on 3/24/17.
 */
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    ApplyMaterialDAO applyMaterialDAO;

    @Autowired
    CompanyDAO companyDAO;

    @Autowired
    ProductionDAO productionDAO;

    @Autowired
    MaterialListDAO materialListDAO;

    @Override
    public boolean register(Company company) {
        return companyDAO.insertCompany(company)>0? true:false;
    }

    @Override
    public boolean isExist(String email) {
        return companyDAO.isExist(email)!=null? true:false;
    }

    @Override
    public void produce(Production production) {
        productionDAO.insertProduction(production);
    }

    @Override
    public void process(Production production, List<Material> materialList) {
        productionDAO.insertProduction(production);
        for (Material m:materialList) {
            materialListDAO.insertMaterialList(m);
        }
    }

    @Override
    public List<Production> getValidateProduction() {
        return productionDAO.getValidateProduction();
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
    public List<RealProduction> getHaveProduction() {


        return null;

    }

    @Override
    public void produceReal(RealProduction realProduction)   {

    }

    @Override
    public void processReal(Production realProduction) {

    }

    @Override
    public void transportReal(RealProduction realProduction, long companyID) {

    }

    @Override
    public void applyExternal(long companyID,Production production, Company company) {
        company.setExternal(true);
        long externalID=companyDAO.insertCompany(company);

        production.setCompanyID(externalID);
        long productionID=productionDAO.insertProduction(production);

        ApplyMaterial applyMaterial=new ApplyMaterial();
        applyMaterial.setCompanyID(companyID);
        applyMaterial.setValidate(0);
        applyMaterial.setApplyTime(System.currentTimeMillis()/1000);
        applyMaterial.setProductionID(productionID);


        applyMaterialDAO.insertApplyMaterial(applyMaterial);

    }
}
