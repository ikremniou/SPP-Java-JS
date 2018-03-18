package com.ilyashutko.buspark.bl;

import com.ilyashutko.buspark.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}