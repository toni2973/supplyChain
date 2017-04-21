package com.nju.toni.supplychain.service;

import com.nju.toni.supplychain.entity.Company;
import com.nju.toni.supplychain.entity.Result;

/**
 * Created by toni on 4/14/17.
 */
public interface CompanyInfoService {
    Result modifyCompany(Company company);
}
