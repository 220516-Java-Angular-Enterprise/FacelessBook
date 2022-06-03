package com.revature.facelessbook.util.CustomException;

public class ValidationException extends RuntimeException {
    public ValidationException(String validating) {
        super("Failed to validate: "+validating);
    }
}
