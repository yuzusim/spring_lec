package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/main") // 이미 메인 메이지를 만들어 놨기 때문에 이때 리다이랙션을 한다.
    public String main() { //
        return "main";
    }

}
