package com.nju.toni.supplychain.DAO;

import com.nju.toni.supplychain.entity.Company;
import com.nju.toni.supplychain.po.CompanyPO;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by toni on 3/20/17.
 */
@Repository("CompanyDAO")
public interface CompanyDAO {
    public int insertCompany(Company company);
    public int updateCompany(CompanyPO company);
    public void deleteCompany(@Param("ID") int ID);
    public Company findCompanyByID(@Param("ID") int ID);
    public Company login(@Param("email") String eamil,@Param("password") String password);
    public Company isExist(@Param("email") String email);
    public List<Company> getNoValidateCompany();
    public List<Company> getAllCompany();
}