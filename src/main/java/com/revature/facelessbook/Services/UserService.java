package com.revature.facelessbook.Services;

import com.revature.facelessbook.daos.UserDAO;
import com.revature.facelessbook.util.CustomException.ValidationException;

public class UserService {
    private final UserDAO mUserDAO;

    public UserService(UserDAO uDAO) {
        mUserDAO = uDAO;
    }

    public boolean isValidPassword(String pass) {
        if(pass.matches("^.{8,}"))
            return true;
        throw new ValidationException("password");
    }

    public boolean isValidUsername(String name) {
        if(name.matches("^\\w{8,20}$"))
            return true;
        throw new ValidationException("username");
    }

    public boolean isDuplicateUsername(String name) {
        if(mUserDAO != null)
            throw new ValidationException("existing username");
        return false;
    }
}
