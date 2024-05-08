package com.sunupapa.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 스프링 이 com.sunupapa.blog 패키지 이하를 스캔 해서 모든 파일을 메모리 에 new 하는 것은 아니 구요.
 * 특정 annotation 이 붙어 있는 클래스 파일들 을 new 해서 (IoC) 스프링 container 에 관리 하여 줍니다.
 */
@RestController // restApi 사용을 알리는 annotation
public class BlogController { // 클래스 선언
    // http://localhost:8080/test/hello
    @GetMapping("/test/hello") // Get 메써드 URI 지정
    public String hello() { // hello 함수 -> 위의 URI 입력 시 해당 메써드 진입
        return "<h1>First Page</h1>";
    }
}
