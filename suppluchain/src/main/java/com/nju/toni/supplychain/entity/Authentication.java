package com.nju.toni.supplychain.entity;

/**
 * Created by toni on 3/18/17.
 */
public class Authentication {
    private String password;
    private String username;
    private long ID;

    public Authentication(String username, String password) {
        this.username=username;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
}
