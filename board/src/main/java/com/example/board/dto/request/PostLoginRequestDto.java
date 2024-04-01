package com.example.board.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostLoginRequestDto {
    private String email;

    private String password;
}
