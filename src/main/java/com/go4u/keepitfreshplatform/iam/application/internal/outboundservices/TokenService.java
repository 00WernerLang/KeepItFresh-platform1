package com.go4u.keepitfreshplatform.iam.application.internal.outboundservices;

public interface TokenService {

    String generateToken(String username);
    String getUsernameFromToken(String token);
    boolean validateToken(String token);

}
