package com.ohgiraffers.springlastteam.mypage.repository;

import com.ohgiraffers.springlastteam.entity.GroupBuying;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupBuyingRepository extends JpaRepository<GroupBuying, Integer> {
    List<GroupBuying> findByUser_UserNo(int userNo); // 수정: findByUser_UserNo 로 변경
}
