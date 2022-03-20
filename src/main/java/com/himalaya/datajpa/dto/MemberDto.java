package com.himalaya.datajpa.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = {"id", "username", "teamName"})
public class MemberDto {

    private Long id;
    private String username;
    private String teamName;

}
