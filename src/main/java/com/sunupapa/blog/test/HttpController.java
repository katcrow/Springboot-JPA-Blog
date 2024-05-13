package com.sunupapa.blog.test;

import org.springframework.web.bind.annotation.*;

/**
 * 사용자 요청 -> 응답 (Data) -> @RestController
 * 사용자 요청 -> 응답 (HTML) -> @Controller
 */

@RestController   // rest Api 사용을 알리는 annotation -> Data 응답
public class HttpController {

    private static final String TAG = "HttpController : "; // 태그 생성

    @GetMapping("/http/lombok")
    public String lombokTest() {
        Member m1 = Member.builder().username("sunupapa").password("1234").email("test.com").build();
        System.out.println(TAG + "getter : " + m1.getUsername());
        m1.setUsername("Park");
        System.out.println(TAG + "setter : " + m1.getUsername());

        return "lombok test 완료";
    }

    // 인터넷 브라우저 요청은 무조건 get요청만 할 수 있다.
    // http://localhost:8080/http/get -> select
    @GetMapping("/http/get") // Get 메써드 URI 지정
    public String getTest(Member m) { // getTest 함수 -> 위의 URI 입력 시 해당 메써드 진입
        return "get 요청 : " + m.getId() + ", " + m.getUsername() + ", " + m.getPassword() + ", " + m.getEmail();
    }

    // http://localhost:8080/http/post -> insert
    @PostMapping("/http/post") // Post 메써드 URI 지정
    public String postTest(@RequestBody Member m) { //-- MessageConverter(스프링부트)<<<자동으로 매핑해준다.
        return "post 요청 : " + m.getId() + ", " + m.getUsername() + ", " + m.getPassword() + ", " + m.getEmail();
    }

    // http://localhost:8080/http/put -> update
    @PutMapping("/http/put") // Put 메써드 URI 지정
    public String putTest(@RequestBody Member m) {
        return "put 요청" + m.getId() + ", " + m.getPassword();
    }

    // http://localhost:8080/http/delete -> delete
    @DeleteMapping("/http/delete") // Delete 메써드 URI 지정
    public String deleteTest() {
        return "delete 요청";
    }
}
