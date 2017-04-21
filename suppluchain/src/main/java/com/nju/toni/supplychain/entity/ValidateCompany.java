package com.nju.toni.supplychain.entity;

/**
 * Created by toni on 3/18/17.
 */
public class ValidateCompany {
    private long ID;
    private long companyID;
    private long authenticationID;
    private long valiTime;

    private String comment;
    private Validate validate;

    public ValidateCompany() {
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }





    public long getAuthenticationID() {
        return authenticationID;
    }

    public void setAuthenticationID(long authenticationID) {
        this.authenticationID = authenticationID;
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



    public long getValiTime() {
        return valiTime;
    }

    public void setValiTime(long valiTime) {
        this.valiTime = valiTime;
    }

    public Validate getValidate() {
        return validate;
    }

    public void setValidate(Validate validate) {
        this.validate = validate;
    }

    public long insertValidateCompany(ValidateCompany validateCompany) {
        return 0;
    }
}
