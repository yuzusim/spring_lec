package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//@RestController // 리턴시 문자를 그대로 응답 -> 파일을 찾아서 포워드 해줌 -> 데이터 리턴
@Controller //  리턴시 파일을 응답 (템플렌 엔진 같은 걸 쓰는 리턴 파일을 찾아줌 )
// 컨트롤러의 책임
// 주소요청 받아서 파싱하고  유효성 검사 적절한 뷰를 찾아줌
public class UserController {

    @GetMapping("/joinForm")
    public String joinForm() {
        return "joinForm";
    }

    @PostMapping("/join")
    public String join(String username, String password, String email) {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String email = request.getParameter("email");

        System.out.println("username:" + username);
        System.out.println("password:" + password);
        System.out.println("email:" + email);

        // 1. DB return "redirect:/main";

        if (username.length() > 10) {
            return "error-404";

        }

        return "redirect:/main";
        // 만들어진 컨틀롤러 찾아서 리다이렉션 해줘야 함 -> BoardController
        // 응답 send가 발동
        // :으로 파싱해서 로케이션을 넣어줌


    }
}
