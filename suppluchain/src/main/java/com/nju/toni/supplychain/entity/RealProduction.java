package com.nju.toni.supplychain.entity;

/**
 * Created by toni on 3/21/17.
 */
public class RealProduction {
    private Production production;
    private long produceTime;
    private String transaction;

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public long getProduceTime() {
        return produceTime;
    }

    public void setProduceTime(long produceTime) {
        this.produceTime = produceTime;
    }

    public Production getProduction() {
        return production;
    }

    public void setProduction(Production production) {
        this.production = production;
    }
}
