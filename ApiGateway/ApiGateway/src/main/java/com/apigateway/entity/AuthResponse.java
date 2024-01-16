package com.apigateway.entity;

import lombok.*;

import java.util.Collection;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuthResponse {
    private String userId;
    private String accessToken;
    private String refreshToken;
    private Long expireAt;
    private Collection<String> authorities;
}
