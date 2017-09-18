package com.example.springboot.SpringBootCRUDApplication.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.SpringBootCRUDApplication.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
 
    User findByName(String name);
 
}
