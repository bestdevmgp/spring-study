package com.example.spring_study;

import com.example.spring_study.controller.MemberController;
import com.example.spring_study.repository.MemberRepository;
import com.example.spring_study.repository.MemoryMemberRepository;
import com.example.spring_study.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigure {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
