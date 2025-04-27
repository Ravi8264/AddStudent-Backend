package com.example.MathpreDictionWithMongoDb.security;

import com.example.MathpreDictionWithMongoDb.entity.student;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

@Service
public class SecurityService {
    
    private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private static final long JWT_EXPIRATION = 86400000; // 24 hours
    private static final long REFRESH_EXPIRATION = 604800000; // 7 days

    public void generateAndSetTokens(student st) {
        try {
            String jwtToken = Jwts.builder()
                .setSubject(st.getEmail())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + JWT_EXPIRATION))
                .signWith(key)
                .compact();

            String refreshToken = Jwts.builder()
                .setSubject(st.getEmail())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + REFRESH_EXPIRATION))
                .signWith(key)
                .compact();
                
            // Set tokens in student object
            st.setJwtToken(jwtToken);
            st.setRefreshToken(refreshToken);
            
            System.out.println("✅ Tokens generated and set for: " + st.getName());
        } catch (Exception e) {
            System.out.println("❌ Error generating tokens: " + e.getMessage());
        }
    }
}