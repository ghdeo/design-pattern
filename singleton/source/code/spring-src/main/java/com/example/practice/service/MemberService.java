package com.example.practice.service;

import com.example.practice.domain.Member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
