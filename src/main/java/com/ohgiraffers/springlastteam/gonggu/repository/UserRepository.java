package com.ohgiraffers.springlastteam.gonggu.repository;

import com.ohgiraffers.springlastteam.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUserIdAndUserPwd(String userId, String userPwd);
    boolean existsByUserId(String userId);

}