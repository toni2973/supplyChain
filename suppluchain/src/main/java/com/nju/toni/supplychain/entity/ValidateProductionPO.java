package com.nju.toni.supplychain.entity;

/**
 * Created by toni on 3/20/17.
 */
public class ValidateProductionPO {
    private long ID;
    private long productionID;
    private long auditID;
    private long valiTime;
    private String validate;
    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }



    public long getValiTime() {
        return valiTime;
    }

    public void setValiTime(long valiTime) {
        this.valiTime = valiTime;
    }

    public long getAuditID() {
        return auditID;
    }

    public void setAuditID(long auditID) {
        this.auditID = auditID;
    }

    public long getProductionID() {
        return productionID;
    }

    public void setProductionID(long productionID) {
        this.productionID = productionID;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }



    public String getValidate() {
        return validate;
    }

    public void setValidate(String validate) {
        this.validate = validate;
    }
}
