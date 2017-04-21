package com.nju.toni.supplychain.entity;

/**
 * Created by toni on 3/20/17.
 */


public class ProcessingOrder {
    private Production production;

    private Material[] materialList;


    public Material[] getMaterialList() {
        return materialList;
    }

    public void setMaterialList(Material[] materialList) {
        this.materialList = materialList;
    }

    public Production getProduction() {
        return production;
    }

    public void setProduction(Production production) {
        this.production = production;
    }
}
