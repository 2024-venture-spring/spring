package com.ohgiraffers.springlastteam.mypage.controller;

import com.ohgiraffers.springlastteam.entity.BuyingUser;
import com.ohgiraffers.springlastteam.entity.Users;
import com.ohgiraffers.springlastteam.mypage.repository.BuyingUserRepository;
import com.ohgiraffers.springlastteam.mypage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class MypageController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BuyingUserRepository buyingUserRepository;

    @GetMapping(value = {"/mypage"})
    public String mypage() {
        return "mypage/mypage";
    }

    @GetMapping("/purchashistory")
    public String getPurchaseHistory(Model model) {
        // 데이터베이스에서 사용자 정보를 가져옵니다.
        Users user = userRepository.findById(1).orElseThrow(() -> new RuntimeException("User not found"));

        // 사용자 구매 내역을 가져옵니다.
        List<BuyingUser> transactions = buyingUserRepository.findByUserNo(user.getUserNo());

        model.addAttribute("profileName", user.getUserName()); // 프로필 이름 설정
        model.addAttribute("transactions", transactions);

        return "mypage/purchashistory";
    }
}
