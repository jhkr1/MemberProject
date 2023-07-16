package com.jhkr1.MemberProject.service;

import com.jhkr1.MemberProject.dto.MemberDTO;
import com.jhkr1.MemberProject.entity.MemberEntity;
import com.jhkr1.MemberProject.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
        // 1. dto -> entity 변환
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        // 2. repository의 save메서드 호출 (조건. entity 객체를 넘겨줘야 함)
        memberRepository.save(memberEntity);


    }
}