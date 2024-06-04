package com.ohgiraffers.springlastteam.mypage.repository;

import com.ohgiraffers.springlastteam.entity.BuyingUser;
import com.ohgiraffers.springlastteam.entity.BuyingUserId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BuyingUserRepository extends JpaRepository<BuyingUser, BuyingUserId> {
    List<BuyingUser> findByUserNo(int userNo);
}