package com.aparna.mongoDBDemo.Exceptions;

public class DuplicateStudentException extends RuntimeException {
    public DuplicateStudentException(String msg){
        super(msg);
    }
}
