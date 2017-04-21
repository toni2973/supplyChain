package com.nju.toni.supplychain.entity;

/**
 * Created by toni on 3/19/17.
 */
public class Audit {
    private long ID;
    private String username;
    private String password;

    public Audit(String username, String password) {
        this.username=username;
        this.password=password;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
