package com.revature.facelessbook.Services;

public class UserService {
    private Object mVar;

    public UserService(Object obj) {
        mVar = obj;
    }

    public boolean isValidPassword(String pass) {
        return true;
    }

    public boolean isValidUsername(String name) {
        return true;
    }

    public boolean isDuplicateUsername(String name) {
        return true;
    }
}
