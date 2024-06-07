package com.ohgiraffers.springlastteam.mypage.repository;

import com.ohgiraffers.springlastteam.entity.BuyingUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyPageBuyingUserRepository extends JpaRepository<BuyingUser, Integer> {
    List<BuyingUser> findByUserNoUserNo(int userNo);  // 수정: findByUserNoUserNo 로 변경
}