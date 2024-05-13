package com.sunupapa.blog.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

// ORM -> Java(다른 언어) Object -> 테이블로 매핑해주는 기술
@Entity // User 클래스가 MySQL에 테이블이 생성이 된다.
public class User {
    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
    private int id; // 시퀀스, auto_increment

    @Column(nullable = false, length = 30) // null이 될 수 없다. 길이 제한
    private String username; // 아이디

    @Column(nullable = false, length = 100) // 해쉬로 암호화할 것이기 때문에 길이를 넉넉히 잡아준다.
    private String password; // 비밀번호

    @Column(nullable = false, length = 50) // null이 될 수 없다. 길이 제한
    private String email; // 이메일

    @ColumnDefault("'user'") // DB는 RoleType이라는 게 없다. // 디폴트값을 줄 수 있다.
    private String role; // Enum을 쓰는게 좋다. // admin, user, manager

    @CreationTimestamp // 시간이 자동 입력
    private Timestamp createDate;
}
