package com.revature.facelessbook.Services;

import com.revature.facelessbook.daos.UserDAO;
import com.revature.facelessbook.util.CustomException.ValidationException;

public class UserService {
    private UserDAO mUserDao;

    public UserService(UserDAO uDAO) {
        mUserDao = uDAO;
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
        if(false/*mUserDAO query for usernames and is present*/)
            throw new ValidationException("existing username");
        return false;
    }
}
