package com.study.SpringSecurity.exception;

import lombok.Getter;
import org.springframework.validation.FieldError;

import java.util.List;

public class ValidException extends RuntimeException {

    @Getter
    private List<FieldError> fieldErrors;

    public ValidException(String messsage, List<FieldError> fieldErrors) {
        super(messsage);
        this.fieldErrors = fieldErrors;
    }
}
