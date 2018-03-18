package com.ilyashutko.buspark.bl.impl;

import com.ilyashutko.buspark.bl.RoleService;
import com.ilyashutko.buspark.dal.RoleRepository;
import com.ilyashutko.buspark.model.Role;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role create(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role update(int oldRoleId, Role role) {
        Role selectedRole = roleRepository.findOne(Long.valueOf(oldRoleId));
        selectedRole.setName(role.getName());
        selectedRole.setUsers(role.getUsers());
        return roleRepository.save(selectedRole);
    }

    @Override
    public Role read(int roleId) {
        return roleRepository.findOne(Long.valueOf(roleId));
    }

    @Override
    public void delete(int roleId) {
        roleRepository.delete(Long.valueOf(roleId));
    }

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }
}
