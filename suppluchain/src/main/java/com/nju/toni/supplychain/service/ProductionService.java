package com.nju.toni.supplychain.service;

import com.nju.toni.supplychain.entity.Production;
import com.nju.toni.supplychain.entity.Result;
import com.nju.toni.supplychain.entity.Validate;

import java.util.List;

/**
 * Created by toni on 4/14/17.
 */
public interface ProductionService {
    void getAllProductions();
    List<Production> findProduction(String[] filters, String values[], Validate validate, String keywords);
    Result addProduction(Production prodution);
}
