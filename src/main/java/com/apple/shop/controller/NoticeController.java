package com.apple.shop.controller;

import com.apple.shop.domain.Notice;
import com.apple.shop.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class NoticeController {
    private final NoticeRepository noticeRepository;

    @GetMapping("/notice")
    public String notice(Model model) {
       List<Notice> reult =  noticeRepository.findAll();
       model.addAttribute("notices", reult);
       return "notice.html";

    }
}
