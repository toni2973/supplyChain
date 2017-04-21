package com.nju.toni.supplychain.service.imp;

import com.nju.toni.supplychain.DAO.*;
import com.nju.toni.supplychain.entity.*;
import com.nju.toni.supplychain.po.CompanyPO;
import com.nju.toni.supplychain.service.AuthenticationService;
import com.nju.toni.supplychain.service.impl.utils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by toni on 3/24/17.
 */
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    ProductionDAO productionDAO;

    @Autowired
    AuthenticationDAO authenticationDAO;
    @Autowired
    ValidateCompanyDAO validateCompanyDAO;
    @Autowired
    CompanyDAO companyDAO;
    @Autowired
    CompanyCopyDAO companyCopyDAO;

    @Override
    public Authentication login(String username, String password) {
        return authenticationDAO.login(username,password);
    }

    @Override
    public boolean addProductiion(Production production) {
        return productionDAO.insertProduction(production)>0? true:false;

    }

    @Override
    public Result validateCompany(long authenticationID, Company company, Result result) {
        ValidateCompany validateCompany=new ValidateCompany();
        validateCompany.setCompanyID(company.getID());
        validateCompany.setComment(result.getMessage());
        validateCompany.setValiTime(utils.getCurrentTime());
        validateCompany.setAuthenticationID(authenticationID);
        long validateCompanyID=validateCompany.insertValidateCompany(validateCompany);
        CompanyPO companyPO=utils.convert(company);
        companyPO.setValidateID(validateCompanyID);
        companyPO.setVallidate(result.getValidate().toString());
        if (result.getValidate()==Validate.SUCCESS) {
            companyCopyDAO.insertOrUpdate(companyPO);
        }
        int count=companyDAO.updateCompany(companyPO);

        return utils.upsdateReuslt(count);
    }
}
