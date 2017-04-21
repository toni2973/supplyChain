package com.nju.toni.supplychain.service.imp;

import com.nju.toni.supplychain.DAO.ProductionDAO;
import com.nju.toni.supplychain.entity.Production;
import com.nju.toni.supplychain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by toni on 3/24/17.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    ProductionDAO productionDAO;

    @Override
    public Production view(long productionID) {
        return productionDAO.findProductionByID(productionID);

    }
}
