package com.ilyashutko.buspark.dal;

import com.ilyashutko.buspark.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<User, Long> {

}
