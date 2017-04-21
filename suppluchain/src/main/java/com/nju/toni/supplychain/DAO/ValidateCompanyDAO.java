package com.nju.toni.supplychain.DAO;

import com.nju.toni.supplychain.entity.ValidateCompany;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by toni on 3/20/17.
 */
@Repository("ValidateCompanyDAO")
public interface ValidateCompanyDAO {
    public void insertValidateCompany(ValidateCompany validateCompany);
    public void updateValidateCompany(ValidateCompany validateCompany);
    public void deleteValidateCompany(@Param("ID") int ID);
    public ValidateCompany findValidateCompanyByID(@Param("ID") int ID);
}
