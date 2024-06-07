package com.ohgiraffers.springlastteam.mypage.controller;

import com.ohgiraffers.springlastteam.entity.BuyingUser;
import com.ohgiraffers.springlastteam.entity.GroupBuying;
import com.ohgiraffers.springlastteam.entity.Users;
import com.ohgiraffers.springlastteam.mypage.repository.MyPageBuyingUserRepository;
import com.ohgiraffers.springlastteam.mypage.repository.MyPageGroupBuyingRepository;
import com.ohgiraffers.springlastteam.mypage.repository.MyPageUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MypageController {

    @Autowired
    private MyPageUserRepository userRepository;

    @Autowired
    private MyPageBuyingUserRepository buyingUserRepository;

    @Autowired
    private MyPageGroupBuyingRepository groupBuyingRepository;


    @GetMapping("/mypage")
    public String mypage(Model model) {
        int userNo = 1; // 임의의 userNo = 1로 설정
        Users user = userRepository.findById(userNo).orElseThrow(() -> new RuntimeException("User not found"));
        model.addAttribute("user", user);
        return "mypage/mypage";
    }

    @PostMapping("/mypage/update")
    public String updateUser(
            @RequestParam int userNo,
            @RequestParam(required = false) String currentPassword,
            @RequestParam(required = false) String newPassword,
            @RequestParam(required = false) String confirmPassword,
            @RequestParam String userPhone,
            @RequestParam String userApartment,
            @RequestParam String userApartNum,
            @ModelAttribute Users updatedUser,
            Model model) {

        // 전화번호 형식 검증
        String phonePattern = "^010-\\d{4}-\\d{4}$";
        if (!userPhone.matches(phonePattern)) {
            Users user = userRepository.findById(userNo)
                    .orElseThrow(() -> new RuntimeException("User not found"));
            model.addAttribute("user", user);
            model.addAttribute("errorMessage", "올바른 전화번호 형식이 아닙니다. 010-1234-5678 형식으로 입력해주세요.");
            return "mypage/mypage";
        }

        Users user = userRepository.findById(userNo)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // 비밀번호 변경 로직
        if (currentPassword != null && !currentPassword.isEmpty()) {
            if (!user.getUserPwd().equals(currentPassword)) {
                model.addAttribute("user", user);
                model.addAttribute("errorMessage", "현재 비밀번호가 일치하지 않습니다.");
                return "mypage/mypage";
            }
            if (!newPassword.equals(confirmPassword)) {
                model.addAttribute("user", user);
                model.addAttribute("errorMessage", "새 비밀번호와 확인 비밀번호가 일치하지 않습니다.");
                return "mypage/mypage";
            }
            user.setUserPwd(newPassword);
        }

        // 전화번호 업데이트
        user.setUserPhone(userPhone);

        // 아파트 이름과 상세 주소 업데이트
        user.setUserApartment(userApartment);
        user.setUserApartNum(userApartNum);

        userRepository.save(user);

        return "redirect:/mypage";
    }

    @GetMapping("/purchashistory")
    public String getPurchaseHistory(Model model) {
        int userNo = 1; // 임의의 userNo = 3로 설정
        Users user = userRepository.findById(userNo).orElseThrow(() -> new RuntimeException("User not found"));
        List<BuyingUser> transactions = buyingUserRepository.findByUserNoUserNo(userNo);
        model.addAttribute("transactions", transactions);
        model.addAttribute("profileName", user.getUserName()); // 추가: 프로필 이름 설정

        // 추가: 판매자 이름 및 총 가격 설정
        List<String> sellerNames = transactions.stream()
                .map(transaction -> transaction.getBuyingNo().getUser().getUserName())
                .collect(Collectors.toList());
        List<Integer> totalPrices = transactions.stream()
                .map(transaction -> transaction.getBuyingQuantity() * Integer.parseInt(transaction.getBuyingNo().getBuyingPrice()))
                .collect(Collectors.toList());
        model.addAttribute("sellerNames", sellerNames);
        model.addAttribute("totalPrices", totalPrices);

        return "mypage/purchashistory";
    }
    @GetMapping("/mypage/myposts")
    public String getMyPosts(Model model) {
        int userNo = 1; // 임의의 userNo 설정
        Users user = userRepository.findById(userNo).orElseThrow(() -> new RuntimeException("User not found"));
        List<GroupBuying> myPosts = groupBuyingRepository.findByUser_UserNo(userNo); // 수정된 메서드 호출
        model.addAttribute("myPosts", myPosts);
        model.addAttribute("profileName", user.getUserName()); // 추가: 프로필 이름 설정
        return "mypage/mywritelist";
    }



    @PostMapping("/mypage/myposts/delete")
    public String deleteMyPost(@RequestParam int postId) {
        groupBuyingRepository.deleteById(postId);
        return "redirect:/mypage/myposts";
    }
}
