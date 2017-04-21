package com.nju.toni.supplychain.service;

import com.nju.toni.supplychain.entity.Admin;
import com.nju.toni.supplychain.entity.Company;

import java.util.List;

/**
 * Created by toni on 3/21/17.
 */
public interface AdminService {
    public Admin login(String username, String password);
    public void validateCompany(Admin admin,Company company, boolean result, String comment);
    public List<Company> getNoValidateCompany();
    public List<Company> getAllCompany();
    public List<Company> getValidateCompany();
    public boolean addAudit(String username,String password);
    public boolean addAuthenticaion(String username,String password);
    public boolean addAdmin(String username,String password);
    public boolean isExist(String username);

}
