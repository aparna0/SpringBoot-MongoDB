package com.aparna.mongoDBDemo.Exceptions;

public class InSufficientInputFields extends RuntimeException{
    public InSufficientInputFields(String msg){
        super(msg);
    }
}
