package com.xiaoyu.common.base.util;


import com.alibaba.fastjson.JSON;
import com.xiaoyu.common.base.req.LoginUserInfo;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

/**
 * WJY
 */
public class JwtUtil {

    private final static String SESSION_USER_INFO = "userInfo";
    private final static Integer SESSION_EFFECT_SECONDS = 30 * 60;

    public static String createToken(LoginUserInfo userInfo) throws Exception {
        if (Objects.isNull(userInfo)){
            return null;
        }
        return Jwts.builder()
                .setExpiration(DateUtil.addSeconds(new Date(),SESSION_EFFECT_SECONDS))
                .claim(SESSION_USER_INFO,userInfo)
                .signWith(SecretUtil.buildRsaPrivateKey(SecretUtil.RSA_PRIVATE_KEY),SignatureAlgorithm.RS256)
                .compact();
    }

    public static LoginUserInfo parseToken(String token) throws Exception {
        Claims body = Jwts.parserBuilder().
                setSigningKey(SecretUtil.buildRsaPublicKey(SecretUtil.RSA_PUBLIC_KEY)).
                build().parseClaimsJws(token).getBody();
        Map userInfoMap = body.get(SESSION_USER_INFO, Map.class);
        return JSON.parseObject(JSON.toJSONString(userInfoMap), LoginUserInfo.class);
    }

    public static void main(String[] args) throws Exception {
        LoginUserInfo loginUserInfo = new LoginUserInfo();
        loginUserInfo.setUserId(5L);
        loginUserInfo.setUserName("aaa");
        loginUserInfo.setUserType("1");
        String token = createToken(loginUserInfo);
        System.out.println(token);
        LoginUserInfo reso = parseToken(token);
        System.out.println(JSON.toJSONString(reso));
        //System.out.println(createToken(loginUserInfo));
    }

}
