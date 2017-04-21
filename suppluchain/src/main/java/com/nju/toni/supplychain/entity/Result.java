package com.nju.toni.supplychain.entity;

/**
 * Created by toni on 4/14/17.
 */
public class Result {
    private Validate validate;
    private String message;

    public Result(){

    }
    public Result(Validate validate,String message){
        this.validate=validate;
        this.message=message;
    }
    public Validate getValidate() {
        return validate;
    }

    public void setValidate(Validate validate) {
        this.validate = validate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
