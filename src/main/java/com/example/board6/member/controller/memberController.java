package com.example.board6.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class memberController {

    @GetMapping("/member/login")
    public String login() {
        return "/member/login";
    }
}
