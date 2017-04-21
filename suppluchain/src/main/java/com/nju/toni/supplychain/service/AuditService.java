package com.nju.toni.supplychain.service;

import com.nju.toni.supplychain.entity.Audit;
import com.nju.toni.supplychain.entity.Production;

import java.util.List;

/**
 * Created by toni on 3/21/17.
 */
public interface AuditService {
    public Audit login(String username, String password);
    public void validateProduction(Audit audit,Production production,boolean result,String comment);
    public List<Production> getNoValidateProduction();
    public List<Production> getAllProduction();
    public List<Production> getValidateProduction();
}
