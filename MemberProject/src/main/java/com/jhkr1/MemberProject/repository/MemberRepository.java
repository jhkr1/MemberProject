package com.jhkr1.MemberProject.repository;

import com.jhkr1.MemberProject.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
}
