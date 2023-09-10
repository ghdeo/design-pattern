package com.example.practice;

import com.example.practice.repository.MemoryMemberRepository;
import com.example.practice.service.MemberService;
import com.example.practice.service.MemberServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

}