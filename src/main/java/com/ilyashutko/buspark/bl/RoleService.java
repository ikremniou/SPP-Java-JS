package com.ilyashutko.buspark.bl;

import com.ilyashutko.buspark.model.Role;
import java.util.List;

public interface RoleService {
    Role create(Role role);
    Role update(int oldRoleId, Role role);
    Role read(int roleId);
    void delete(int roleId);
    List<Role> getAll();
}
