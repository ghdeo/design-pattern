package com.example.practice.service;

import com.example.practice.domain.Member;
import com.example.practice.repository.MemberRepository;
import com.example.practice.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}