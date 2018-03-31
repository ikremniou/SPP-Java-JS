package com.ilyashutko.buspark.bl.impl;

import com.ilyashutko.buspark.bl.UserService;
import com.ilyashutko.buspark.dal.RoleRepository;
import com.ilyashutko.buspark.dal.UserRepository;
import com.ilyashutko.buspark.model.Role;
import com.ilyashutko.buspark.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        HashSet<Role> roleSet = new HashSet<>();

        roleSet.add(roleRepository.findByName("USER"));

        user.setRoles(roleSet);
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> getDrivers() {
        return  null;
    }

    @Override
    public void addRoleToUser(User user, Role role) {
        User findUser = userRepository.findOne(Long.valueOf(user.getId()));
        findUser.addRole(role);
        userRepository.save(findUser);
    }
}