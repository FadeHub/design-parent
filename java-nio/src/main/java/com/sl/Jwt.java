package com.sl;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * @author shuliangzhao
 * @Title: Jwt
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/8/23 21:49
 */
public class Jwt {
    public static void main(String[] args) {
        JwtBuilder builder = Jwts.builder().setId("123")
                .setSubject("jwt所面向的用户")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256,"tengshe789");
        String s = builder.compact();
        System.out.println(s);
    }
}
