package com.ohgiraffers.springlastteam.mypage.repository;

import com.ohgiraffers.springlastteam.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyPageUserRepository extends JpaRepository<Users, Integer> {
}
