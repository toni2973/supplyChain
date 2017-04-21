package com.nju.toni.supplychain.entity;

/**
 * Created by toni on 3/20/17.
 */
public class Material {
    private long ID;
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
}
