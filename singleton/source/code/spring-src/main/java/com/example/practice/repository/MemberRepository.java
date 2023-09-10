package com.example.practice.repository;

import com.example.practice.domain.Member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
