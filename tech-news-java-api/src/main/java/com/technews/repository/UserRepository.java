package com.technews.repository;

import com.technews.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// interface will inherit the methods used to access the database for standard CRUD operations.
// those methods will be available to any class that auto wires the repo
// like the controller classes that will perform the CRUD operations
// to ensure that the repo can take User and the id of that user, Integer is specified
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByEmail(String email) throws Exception;
}
