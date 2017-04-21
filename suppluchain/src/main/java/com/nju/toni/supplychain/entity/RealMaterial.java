package com.nju.toni.supplychain.entity;

/**
 * Created by toni on 3/21/17.
 */
public class RealMaterial {
    private long ID;
    private int amount;
    private String transaction;

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

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }
}
