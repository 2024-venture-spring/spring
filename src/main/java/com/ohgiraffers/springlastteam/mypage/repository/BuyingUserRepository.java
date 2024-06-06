package com.ohgiraffers.springlastteam.mypage.repository;

import com.ohgiraffers.springlastteam.entity.BuyingUser;
import com.ohgiraffers.springlastteam.entity.BuyingUserId;
import com.ohgiraffers.springlastteam.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BuyingUserRepository extends JpaRepository<BuyingUser, Integer> {
    List<BuyingUser> findByUserNoUserNo(int userNo);  // 수정: findByUserNoUserNo 로 변경
}