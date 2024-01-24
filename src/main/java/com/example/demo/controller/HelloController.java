package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController // new 로 띄워지는 어노 테이션 -> ioc
public class HelloController {

    public HelloController() {
        System.out.printf("HelloController 컴포넌트 스캔됨");
    }

    @GetMapping("/home")
    public void home(){ // 메서드의 명은 중요하지않고 어노테이션으로 때림
        System.out.printf("Hello호출됨");

    }
    @GetMapping("/hello") // 요청 할때마다 동일함 -> 정적 페이지 -> http 헤더에 넣어줌 캐싱해서 쓰라고
    public String hello(){
        String name = "홍길동";
        return "<h1>hello "+name+"</h1>";
        //유효성 검사, 파싱, dao 찾음
        // html 코드에 자바 데이터 베이스를 섞어서 사용할 수 있다.
        //
    }

    @GetMapping("/hello") // 중복을 허용하지 않는다. 요청 할때마다 달라짐 -> 동적 페이지 // 캐싱 하는게 좋다.
    public String random(){
        Random r = new Random();
        int num = r.nextInt(5)+1;
        return "<h1>random "+num+"</h1>";
    }


}
