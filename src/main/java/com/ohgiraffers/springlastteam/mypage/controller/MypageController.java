package com.ohgiraffers.springlastteam.mypage.controller;

import com.ohgiraffers.springlastteam.entity.BuyingUser;
import com.ohgiraffers.springlastteam.entity.Users;
import com.ohgiraffers.springlastteam.mypage.repository.BuyingUserRepository;
import com.ohgiraffers.springlastteam.mypage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;

@Controller
public class MypageController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BuyingUserRepository buyingUserRepository;

    @GetMapping("/mypage")
    public String mypage(Model model) {
        int userNo = 1; // 임의의 userNo = 1로 설정
        Users user = userRepository.findById(userNo).orElseThrow(() -> new RuntimeException("User not found"));
        model.addAttribute("user", user);
        return "mypage/mypage";
    }

    @PostMapping("/mypage/update")
    public String updateUser(@ModelAttribute Users updatedUser) {
        Users user = userRepository.findById(updatedUser.getUserNo())
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setUserPhone(updatedUser.getUserPhone());
        user.setUserPwd(updatedUser.getUserPwd());
        userRepository.save(user);

        return "redirect:/mypage";
    }

    @GetMapping("/purchashistory")
    public String getPurchaseHistory(Model model) {
        // 예를 들어 구매자 1번의 구매 내역을 조회
        int buyingPerson = 1;

        // 구매자 정보를 가져옵니다.
        Users buyer = userRepository.findById(buyingPerson).orElseThrow(() -> new RuntimeException("User not found"));

        // 구매자 구매 내역을 가져옵니다.
        List<BuyingUser> transactions = buyingUserRepository.findByBuyingPerson(buyingPerson);

        // 프로필 이름 설정
        model.addAttribute("profileName", buyer.getUserName());
        model.addAttribute("transactions", transactions);

        return "mypage/purchashistory";
    }
}
