package com.oknym.couple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oknym.couple.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
