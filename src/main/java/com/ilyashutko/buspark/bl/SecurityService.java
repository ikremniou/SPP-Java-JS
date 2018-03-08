package com.ilyashutko.buspark.bl;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
