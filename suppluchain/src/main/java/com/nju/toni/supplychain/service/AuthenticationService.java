package com.nju.toni.supplychain.service;

import com.nju.toni.supplychain.entity.Authentication;
import com.nju.toni.supplychain.entity.Company;
import com.nju.toni.supplychain.entity.Production;
import com.nju.toni.supplychain.entity.Result;

/**
 * Created by toni on 3/21/17.
 */
public interface AuthenticationService {
    public Authentication login(String username, String password);
    public boolean addProductiion(Production production);
    Result validateCompany(long authenticationID, Company company, Result result);
}
