package main;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;

@Service
public class TokenService {
    private final String secret = "MySuperSecretKeyForJwt123456789";

    public String generateToken(String email) {
        Key key = Keys.hmacShaKeyFor(secret.getBytes());
        return Jwts.builder()
                .setSubject(email)
                .signWith(key)
                .compact();
    }

    public Key getSigningKey() {
        return Keys.hmacShaKeyFor(secret.getBytes());
    }
}
