package com.ilyashutko.buspark.bl;

import com.ilyashutko.buspark.model.Role;
import com.ilyashutko.buspark.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
    List<User> getDrivers();
    void addRoleToUser(User user, Role newRole);
}