package com.nju.toni.supplychain.po;

/**
 * Created by toni on 4/15/17.
 */
public class CompanyPO {
    private Long ID;
    private String password;
    private String email;
    private String name;
    private String profile;
    private String telphone;
    private String address;
    private String vallidate;
    private String provefile;
    private long validateID;
    private boolean external;

    public CompanyPO() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getProvefile() {
        return provefile;
    }

    public void setProvefile(String provefile) {
        this.provefile = provefile;
    }

    /**
     * 0 for validating 1 for success -1 for fail.
     * @return the state of validate;
     */
    public String getVallidate() {
        return vallidate;
    }

    public void setVallidate(String vallidate) {
        this.vallidate = vallidate;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
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
}

