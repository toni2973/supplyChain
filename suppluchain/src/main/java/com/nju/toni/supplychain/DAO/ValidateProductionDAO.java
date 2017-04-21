package com.nju.toni.supplychain.DAO;

import com.nju.toni.supplychain.entity.ValidateProductionPO;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by toni on 3/20/17.
 */
@Repository("ValidateProductionDAO")
public interface ValidateProductionDAO {
    public int insertValidateProduction(ValidateProductionPO validateProduction);
    public void updateValidateProduction(ValidateProductionPO validateProduction);
    public void deleteValidateProduction(@Param("ID") int ID);
    public ValidateProductionPO findValidateProductionByID(@Param("ID") int ID);
}
