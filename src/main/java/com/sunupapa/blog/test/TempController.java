package com.sunupapa.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempController {
    // http://localhost:8000/blog/temp/home
    @GetMapping("/temp/home")
    public String tempHome() {
        System.out.println("tempHome()");
        // 파일리턴 기본경로 : src/main/resources/static
        // 리턴명 : /home.html
        // 풀경로 : src/main/resources/static/home.html
        return "/home.html";
    }

    @GetMapping("/temp/img")
    public String tempImg() {
        // 파일리턴 기본경로 : src/main/resources/static
        // 리턴명 : /a.jpg
        // 풀경로 : src/main/resources/static/a.jpg
        // 이미지는 화면에 바로 띄울 수 없다.
        // 이미지를 띄우려면 img 태그를 사용해야 한다.
        return "/a.jpg";
    }

    @GetMapping("/temp/jsp")
    public String tempJsp() {
        // prefix : /WEB-INF/views/
        // suffix : .jsp
        // 풀경로 : /WEB-INF/views/test.jsp
        return "test";
    }
}
