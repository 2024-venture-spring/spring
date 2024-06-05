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
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
