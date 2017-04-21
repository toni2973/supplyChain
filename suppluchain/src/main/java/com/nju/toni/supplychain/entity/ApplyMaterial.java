package com.nju.toni.supplychain.entity;

/**
 * Created by toni on 3/27/17.
 */
public class ApplyMaterial {
    private long ID;
    private long companyID;
    private long productionID;
    private long applyTime;
    private int validate;
    private long valiTime;
    private long AuthenticationID;

    public long getAuthenticationID() {
        return AuthenticationID;
    }

    public void setAuthenticationID(long authenticationID) {
        AuthenticationID = authenticationID;
    }

    public long getValiTime() {
        return valiTime;
    }

    public void setValiTime(long valiTime) {
        this.valiTime = valiTime;
    }

    public int getValidate() {
        return validate;
    }

    public void setValidate(int validate) {
        this.validate = validate;
    }

    public long getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(long applyTime) {
        this.applyTime = applyTime;
    }

    public long getProductionID() {
        return productionID;
    }

    public void setProductionID(long productionID) {
        this.productionID = productionID;
    }

    public long getCompanyID() {
        return companyID;
    }

    public void setCompanyID(long companyID) {
        this.companyID = companyID;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
}
