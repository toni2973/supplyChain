package com.nju.toni.supplychain.service.imp;

import com.nju.toni.supplychain.DAO.*;
import com.nju.toni.supplychain.entity.*;
import com.nju.toni.supplychain.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by toni on 3/23/17.
 */
@Service("AdminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminDAO adminDAO;

    @Autowired
    CompanyDAO companyDAO;

    @Autowired
    ValidateCompanyDAO validateCompanyDAO;

    @Autowired
    AuditDAO auditDAO;

    @Autowired
    AuthenticationDAO authenticationDAO;

    @Override
    public Admin login(String username, String password) {
        return adminDAO.login(username, password);
    }

    @Override
    public void validateCompany(Admin admin,Company company, boolean result, String comment) {
        companyDAO.updateCompany(company);
        ValidateCompany validateCompany=new ValidateCompany();
        validateCompany.setAuthenticationID(admin.getID());
        validateCompany.setComment(comment);
        validateCompany.setCompanyID(company.getID());
        validateCompany.setResult(result);
        validateCompany.setValiTime(System.currentTimeMillis()/1000);
        validateCompanyDAO.insertValidateCompany(validateCompany);
    }


    @Override
    public List<Company> getNoValidateCompany() {
        return companyDAO.getNoValidateCompany();
    }

    @Override
    public List<Company> getAllCompany() {

        return companyDAO.getAllCompany();
    }

    @Override
    public List<Company> getValidateCompany() {
        return null;
    }

    @Override
    public boolean addAudit(String username, String password) {

        Audit audit=new Audit(username,password);
        return auditDAO.insertAudit(audit)>0? true:false;
    }

    @Override
    public boolean addAuthenticaion(String username, String password) {

        Authentication authentication=new Authentication(username,password);
        return authenticationDAO.insertAuthentication(authentication)>1? true:false;
    }

    @Override
    public boolean addAdmin(String username, String password) {

        Admin admin=new Admin(username,password);
        return adminDAO.insertAdmin(admin)>0? true:false;
    }

    @Override
    public boolean isExist(String username) {
        return (adminDAO.isExist(username)!=null)? true:false;
    }
}
