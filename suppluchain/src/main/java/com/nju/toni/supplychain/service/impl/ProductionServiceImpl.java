package com.nju.toni.supplychain.service.impl;

import com.nju.toni.supplychain.DAO.ProductionDAO;
import com.nju.toni.supplychain.entity.Material;
import com.nju.toni.supplychain.entity.Production;
import com.nju.toni.supplychain.entity.Result;
import com.nju.toni.supplychain.entity.Validate;
import com.nju.toni.supplychain.po.ProductionPO;
import com.nju.toni.supplychain.service.ProductionService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/**
 * Created by toni on 4/15/17.
 */
public class ProductionServiceImpl implements ProductionService {
    @Autowired
    ProductionDAO productionDAO;

    Result addProduction(Production production){
        ProductionPO productionPO=new ProductionPO();
        utils.set(productionPO,production);
        productionPO.setValidate(Validate.WAITTING.toString());
        Result result = new Result();
        String[] materials=production.getMaterials().split("/");

        int count = productionDAO.updateCompany(productionPO);
        if (count > 0) {
            result.setValidate(Validate.SUCCESS);
            result.setMessage("success.");
        } else {
            result.setValidate(Validate.FAIL);
            result.setMessage("update fail.");
        }

    }

    @Override
    public void getAllProductions() {

    }

    @Override
    public List<Production> findProduction(String[] filters,String[] values, Validate validate, String keywords) {
        HashMap<String,String> para=new HashMap<>();
        for(int i=0;i<filters.length;i++){
            para.put(filters[i],values[i]);
        }
        para.put("Validate",validate.toString());
        para.put("keywords",keywords);
        return productionDAO.search(para);

    }
}
