package com.jhkr1.MemberProject.dto;

import lombok.*;

import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDTO {
    @Id
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;

}
