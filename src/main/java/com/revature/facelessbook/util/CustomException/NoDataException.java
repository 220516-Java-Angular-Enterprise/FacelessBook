package com.revature.facelessbook.util.CustomException;

public class NoDataException extends RuntimeException {
    public NoDataException(String data) {
        super("No data for "+data);
    }
}
