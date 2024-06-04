package com.ohgiraffers.springlastteam.mypage.controller;

import com.ohgiraffers.springlastteam.entity.BuyingUser;
import com.ohgiraffers.springlastteam.entity.GroupBuying;
import com.ohgiraffers.springlastteam.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class MypageController {

    @GetMapping(value = {"/mypage"})
    public String mypage() {
        return "mypage/mypage";
    }

    @GetMapping("/purchashistory")
    public String getPurchaseHistory(Model model) {
        // 예시 판매자 생성
        Users seller = new Users();
        seller.setUserNo(2);
        seller.setUserName("판매자");
        // 예시 GroupBuying 객체 생성 (판매자 정보 포함)

        GroupBuying groupBuying = new GroupBuying();
        groupBuying.setBuyingNo(1);
        groupBuying.setBuyingTitle("농산품 > 고구마");
        groupBuying.setUser(seller);

        // 예시 BuyingUser 객체 생성 (구매 정보 포함)
        BuyingUser transaction = new BuyingUser();
        transaction.setBuyingNo(groupBuying);
        transaction.setBuyingDate(new Date());
        transaction.setBuyingQuantity(3);
        transaction.setBuyingPerson(1);

        List<BuyingUser> transactions = new ArrayList<>();
        transactions.add(transaction);

        model.addAttribute("profileName", "김애란"); // 프로필 이름 직접 설정
        model.addAttribute("transactions", transactions);

        return "mypage/purchashistory";
        }
}
