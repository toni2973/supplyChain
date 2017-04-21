package com.nju.toni.supplychain.DAO;

import com.nju.toni.supplychain.entity.Production;
import com.nju.toni.supplychain.po.ProductionPO;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by toni on 3/20/17.
 */
@Repository("ProductionDAO")
public interface ProductionDAO {
    public int insertProduction(Production production);
    public int updateProduction(ProductionPO production);
    public void deleteProduction(@Param("ID") int ID);
    public Production findProductionByID(@Param("ID") long ID);
    public List<Production> getNoValidateProduction();
    public List<Production> getAllProduction();

    List<Production> getValidateProduction();

    public int updateCompany(ProductionPO productionPO);

    List<Production> search(HashMap<String, String> filters);
}
