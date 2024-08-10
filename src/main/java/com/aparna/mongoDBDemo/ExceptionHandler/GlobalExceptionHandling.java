package com.aparna.mongoDBDemo.ExceptionHandler;

import com.aparna.mongoDBDemo.Exceptions.DuplicateStudentException;
import com.aparna.mongoDBDemo.Exceptions.InSufficientInputFields;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ControllerAdvice
public class GlobalExceptionHandling {
    @ExceptionHandler(DuplicateStudentException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseStatusException DuplicateStudentExceptionHandler(DuplicateStudentException e){
        return new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
    }

    @ExceptionHandler(InSufficientInputFields.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseStatusException InSufficientInputFieldsHandler(InSufficientInputFields e){
        return new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
}
