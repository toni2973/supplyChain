package com.nju.toni.supplychain.service;

import com.nju.toni.supplychain.entity.Company;
import com.nju.toni.supplychain.entity.Material;
import com.nju.toni.supplychain.entity.Production;
import com.nju.toni.supplychain.entity.RealProduction;

import java.io.IOException;
import java.util.List;

/**
 * Created by toni on 3/21/17.
 */
public interface CompanyService {
    public boolean register(Company company);
    public boolean isExist(String email);
    public void produce(Production production);
    public void process(Production production, List<Material> materialList);

    public List<Production> getValidateProduction();
    public List<Production> getNoValidateProduction();
    public List<Production> getAllProduction();
    public List<RealProduction> getHaveProduction();
    public void produceReal(RealProduction realProduction) throws IOException;
    public void processReal(Production realProduction);
    public void transportReal(RealProduction realProduction,long companyID);
    public void applyExternal(long companyID,Production production,Company company);


}
