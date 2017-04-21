package com.nju.toni.supplychain.entity;

import java.util.SplittableRandom;

/**
 * Created by toni on 3/20/17.
 */
public class Production{
    private long ID;
    private String production_name;
    private String type;
    private int amont;
    private String unit;
    private String spec;
    private String address;
    private String expiration;
    private long barCode;
    private String prove;
    private Validate validate;
    private long validateID;
    private long CompanyID;
    private boolean external;
    private int UNSPSC;
    private String originCountry;
    private String materials;

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getAmont() {
        return amont;
    }

    public void setAmont(int amont) {
        this.amont = amont;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public String getProve() {
        return prove;
    }

    public void setProve(String prove) {
        this.prove = prove;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Validate getValidate() {
        return validate;
    }

    public void setValidate(Validate validate) {
        this.validate = validate;
    }

    public String getProduction_name() {
        return production_name;
    }

    public void setProduction_name(String production_name) {
        this.production_name = production_name;
    }

    public long getValidateID() {
        return validateID;
    }

    public void setValidateID(long validateID) {
        this.validateID = validateID;
    }


    public boolean isExternal() {
        return external;
    }

    public void setExternal(boolean external) {
        this.external = external;
    }

    public long getCompanyID() {
        return CompanyID;
    }

    public void setCompanyID(long companyID) {
        CompanyID = companyID;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public Object getUNSPSC() {
        return UNSPSC;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }
}
