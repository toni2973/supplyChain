package com.nju.toni.supplychain.service.impl;

import com.nju.toni.supplychain.DAO.CompanyDAO;
import com.nju.toni.supplychain.entity.Company;
import com.nju.toni.supplychain.entity.Result;
import com.nju.toni.supplychain.entity.Validate;
import com.nju.toni.supplychain.po.CompanyPO;
import com.nju.toni.supplychain.service.CompanyInfoService;
import com.nju.toni.supplychain.service.impl.utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by toni on 4/14/17.
 */

public class CompanyInfoImpl implements CompanyInfoService {
    @Autowired
    CompanyDAO companyDAO;

    @Transactional(rollbackFor = Exception.class)

    @Override
    public Result modifyCompany(Company company) {
        CompanyPO companyPO = new CompanyPO();
        utils.set(companyPO, company);
        companyPO.setVallidate(Validate.WAITTING.toString());
        Result result = new Result();
        int count = companyDAO.updateCompany(companyPO);
        if (count > 0) {
            result.setValidate(Validate.SUCCESS);
            result.setMessage("success.");
        } else {
            result.setValidate(Validate.FAIL);
            result.setMessage("update fail.");
        }
        return result;
    }
}
