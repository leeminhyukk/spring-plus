package org.example.expert.domain.user.dto.response;

import lombok.Getter;

@Getter
public class UserResponse {

    // 조회할 때에도 닉네임 볼 수 있도록 변경
    private final Long id;
    private final String nickname;
    private final String email;

    public UserResponse(Long id, String nickname, String email) {
        this.id = id;
        this.nickname =nickname;
        this.email = email;
    }
}
