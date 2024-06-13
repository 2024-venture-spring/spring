package com.ohgiraffers.springlastteam.notice.controller;

import com.ohgiraffers.springlastteam.entity.Notice;
import com.ohgiraffers.springlastteam.entity.Users;
import com.ohgiraffers.springlastteam.notice.repository.UserRepository;
import com.ohgiraffers.springlastteam.notice.service.NoticeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/info")
public class NoticeController {

    private final NoticeService noticeService;
    private final UserRepository userRepository;

    @Autowired
    public NoticeController(NoticeService noticeService, @Qualifier("NoticeUserRepository") UserRepository userRepository) {
        this.noticeService = noticeService;
        this.userRepository = userRepository;
    }

    @GetMapping
    public String getAllNotices(Model model, HttpSession session, @RequestParam(defaultValue = "0") int page) {
        Pageable pageable = PageRequest.of(page, 10);
        Page<Notice> noticePage = noticeService.findAllNotices(pageable);
        model.addAttribute("notices", noticePage.getContent());
        model.addAttribute("totalPages", noticePage.getTotalPages());
        model.addAttribute("currentPage", page);
        Users user = (Users) session.getAttribute("user");
        if (user != null && "Y".equals(user.getUserRights())) {
            session.setAttribute("isAdmin", true);
        } else {
            session.setAttribute("isAdmin", false);
        }
        return "info/info";
    }

    @GetMapping("/{id}")
    public String getNoticeById(@PathVariable("id") int id, Model model) {
        Notice notice = noticeService.findNoticeById(id);
        model.addAttribute("notice", notice);
        return "info/notice_detail";
    }

    @GetMapping("/create")
    public String createNoticeForm(HttpSession session) {
        Users user = (Users) session.getAttribute("user");
        if (user != null && "Y".equals(user.getUserRights())) {
            return "info/notice_form";
        }
        return "redirect:/info";
    }

    @PostMapping("/create")
    public String createNotice(@RequestParam String title, @RequestParam String content, HttpSession session) {
        Users user = (Users) session.getAttribute("user");
        if (user == null) {
            return "redirect:/info";
        }
        noticeService.saveNotice(title, content, user.getUserId());
        return "redirect:/info";
    }
}
