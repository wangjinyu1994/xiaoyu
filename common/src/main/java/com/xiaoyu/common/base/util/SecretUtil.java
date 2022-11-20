package com.xiaoyu.common.base.util;

import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import com.xiaoyu.common.base.constants.SysConstantsEnum;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

import javax.crypto.Cipher;

/**
 * WJY
 * 公钥私钥生成工具
 */
public class SecretUtil {

    private final static String RSA_ALGORITHM = "RSA";
    public final static String RSA_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxT3ubvgwpKxl7AWF0hof2KDz1ZWllQZevWlf00BkL/vv94LgspcXFV7F6aRLU2n55DtRd8/sD5+t5IgWsVyF6nYCa7mbUVoomL6/Yoh4c7uIOcw8r7XQsZKY73qNbcu22HLIl0bGYaE/95TKsgYzYUushC8sJp7UxQ3rn2yZsCz8C54B5zSNraAJIMtRg9pIlMrIWFXohqlUS4ZJAbGX/NIAJS3oJzJbCCXlsN3ev0KJcWMIohfl+QklPodPlv5yflFlNyVRyvoM7HVK+5Uy5fLM3tCiuxuhM7MVoxQdCRxXYqkcGsQpJ4ECKQ70izlRBxTM0LrTDViryGGzOeUXXwIDAQAB";
    public final static String RSA_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDFPe5u+DCkrGXsBYXSGh/YoPPVlaWVBl69aV/TQGQv++/3guCylxcVXsXppEtTafnkO1F3z+wPn63kiBaxXIXqdgJruZtRWiiYvr9iiHhzu4g5zDyvtdCxkpjveo1ty7bYcsiXRsZhoT/3lMqyBjNhS6yELywmntTFDeufbJmwLPwLngHnNI2toAkgy1GD2kiUyshYVeiGqVRLhkkBsZf80gAlLegnMlsIJeWw3d6/QolxYwiiF+X5CSU+h0+W/nJ+UWU3JVHK+gzsdUr7lTLl8sze0KK7G6EzsxWjFB0JHFdiqRwaxCkngQIpDvSLOVEHFMzQutMNWKvIYbM55RdfAgMBAAECggEAP0ujgzrkKUQlpPsUuZqmk5b7CJRwQYV8y53QIXOtcvSPSkdWohj4UGRMcLDHd2ovxfz/JMq1f0IHxKmjVqFRXC8okbdLT2z2UCYONqmCtej9S0buRpi68vEPYPJcBlr0Pzt+gYU1zki3xVSbQ0vYGyX0o6qbqX0Y3G+eKFfqbe1Bbk3Ayfm2qy59WRyKEfDaVvvLcqB0GUi4Jsl8PZsJu6L300k02TFOfA9v5Tx8ZNxrHh0G9+wJcX0sZ0EN1ax4usjQezU5aACkp2ZMjz5vQLc1hd/1IjljvqjwSx6knzhSWX0/PdDJQKN2zbk+XHlqiUJosuy94QoG3Gzz6+0fuQKBgQDi/qnoQmHNvCM9TSRNjt3cT1bsKtxtSQcMp6yU+QkO0eXAKMlB6UaZsonem9CBU/N5PEoEqQbJRBdDhfHTPeF8oSKFXUR1/1eZRuIFVCLXWbg1VT8fP92r8BMeAZyPxLCV71LZjfDsyfvtRlSupLp2HnpfKM8ERnvgi1iWWuid5QKBgQDecgHnFSICYdNcUbySHSThhNVLtY1cydCRC9g0qNt5P/9B/cStOVq2J9RjDKxB1QFH/+0rTYtCQKphuM9EfeUME2FyrPQF1iapWfK0fYZQgWbigb9wu8lVaghxyxXoOM8c56ZxjCGHTmexF9kOaMryAPknweE1NgwcEg6Gey7r8wKBgGdnFsMEqkTr9SmRoH3sHMilI7WFeNAXuixbnVRndWbY2s4ERlnOCCkvmXpchEjFk12gxx8EWGEKsYZC1/wgbj01seIKsIsH/EGIdqFyyERNTIqPAKgdkb8nJ649kbI0KTTDxnvwGtXi1O4rYZwE0iPIknoSvur1qKyLDZnAY8K5AoGBALJa0QG6ZQlp7HFSLBMvgPm9atQIXq7uNeeGirU2Srs+P+lmkoKdwQjaiKVebONf6WYUYtJcm3LkrHgsGSv+kV8MTw8Gc6YWXetdboefOclk59xnUdsPBlAQ83Jh9k+69P1lE4Rpahy2FdfdmjC+fzJo610gS/VBP5ZmN/VF4YpXAoGBANQyf7Ozd/c43D5Dz/Y3iR/QTnsRjzvKk11XNHUHYsAlOWhVQwt/WNioKRyAmgz/KgSM97j/CiWFK7UDyhZJ59reGcqPo0xJqeswdhBPUc7Y+KIv5lttp3Qm78E6ADeXHJMz0wMp1nmgv55ERBB9W0r9pj6XKBdOcvZE0BddT9fL";

    public final static String LOGIN_RSA_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgoHQ5xFzkcq7TOLSpATSMuaNfmj5iJFH9UMwP90Uq0efozOS62Oe0IyUQM3nsNf7WubZ4F1nzVgyO/Bw64vUkzklTQrJhbyLbjXvUI98OB1Hq9CHkPrPGceF9CS6QHdPKvZibrA5o8UvkKHCGjAH72VnTPjbzv09zyDnCdn8/dWnjMmInEBnCRoXs8LWJM2n0KL/BK2WMxMoqaidpNnOTQy0N9xL19GEHVy96bA3nTRsa4bZkT7yjW8+i8a0tDY+iTz/ZaMSU0icDnOdCUzTcSnxcjaPs8kleJU9CgaHq3lMWBdVoGahwvXL4HJ8Gpjhtx2vvWdtklVK39+tNnMOqwIDAQAB";
    public final static String LOGIN_RSA_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCCgdDnEXORyrtM4tKkBNIy5o1+aPmIkUf1QzA/3RSrR5+jM5LrY57QjJRAzeew1/ta5tngXWfNWDI78HDri9STOSVNCsmFvItuNe9Qj3w4HUer0IeQ+s8Zx4X0JLpAd08q9mJusDmjxS+QocIaMAfvZWdM+NvO/T3PIOcJ2fz91aeMyYicQGcJGhezwtYkzafQov8ErZYzEyipqJ2k2c5NDLQ33EvX0YQdXL3psDedNGxrhtmRPvKNbz6LxrS0Nj6JPP9loxJTSJwOc50JTNNxKfFyNo+zySV4lT0KBoereUxYF1WgZqHC9cvgcnwamOG3Ha+9Z22SVUrf3602cw6rAgMBAAECggEAWdVyLxxcKScb9rjLtgt7hX4eN72axt76YWF2fP95ks0infyKTW2tjHC4PEOAEMMbSl9N6pthMIBdU9UWZY1DLnRPsNCUF3LJp3uI2DNsllPRWfuY1btPg7dMBdqiOm3mGPSwnPDBPHInY691JQGa9LcgfGNxKvI28bT8VFOxSigdK4rFHRwlRZxaFrfbQ3gxoM1T9ENbPY6mPMVQM4VjvnH+ZgGMBi77llQha5LMvOTdl8Buy1IO/FAK++EkUaEY7JSjw0atQLvUolhl2oa8eTzRkzUnmBxHUr23QwQDzWSaCfSKo6isB5H246G4rQdikhdxFjsAyaisziaTbjqGAQKBgQDnIRJAofwmGgRXUZ7LpRWuw8L+xAH2SM+T8euXiPNwU7bHpBy2z8bjP8l/3AymR/VG/F0YarI/dBydbV83mKXOfvlMOLZ1xA+BRB+BeQ2mQnLKofB69GL3uXuzvobRvxIxHqtGuHxMHbx9KYV8jw82GJdlysc7gqRK3cIoWMO4IQKBgQCQjOb9qVwqOZL2EmkgLin755vsFjoh1t5GtFA4xL/IaSn/JR0LnOKII4kHfIXI5uuN3n2RUzdtyQTdyzYjyzllHMFcJdQMVT5XIoIvhaSaAH4pODJ/oV5219ApXVJdV/53huEdKOgcn734Mwpv6ZoylFgON4/y1zU1RFT8jbR9SwKBgHjWuYxBJGtnPs3IRpWCAgwVHWXFZKE3ABABc4MOfvhDTFSkYL7TctBtERRgH9zv0jUCzElvvzGdqzhDbnzKuiV0DTLkk8COeOzEiRRQDerW4t0+PVSLYRLTTvFys1oF46T6u+GForbI9Tsa8kdlJDbMNJtroS5j5zGdL12YyvsBAoGAS6oFy6fYP54NiFMQxjCD94FAA++KlGYFydre1yhd/0jVG+JQduCzT3HSa6HJ4eTGTme1MNnvfL8plfOmLkxVidDoghSnD6GbVT8SCFAbXiV95JOvE1Hjwa+sHcrkr0m9QNHQilP8U+dmKEKHZxdPiMRP53k8F3CBQJW5Ks3+OUsCgYAgAvjWWqw+tv/1fVT9CmE52IoqpDLiUb1rurJ3qExo9qsOs8idHdqVB3mcLkvoXrdKGmlpOk8GBs+c69nB9wfqH3sk0m8Y2fkQUQ7Sbd5YUH02xfX9p4A6q4yDZ/yC+cZ05UPoMDm0Kv8i4Qih9Nbg/EkRt2c8SCcSfQjuKarbLQ==";

    private final static String USER_PWD_SALT_PREFIX = "xiaoyu1994";
    private final static String USER_PWD_SALT_SUFFIX = "wangjinyu1994";

    public static RSAPrivateKey buildRsaPrivateKey(String privateKey) throws Exception {
        byte[] decoded = Base64.decodeBase64(privateKey);
        RSAPrivateKey priKey = (RSAPrivateKey) KeyFactory.getInstance(RSA_ALGORITHM).generatePrivate(new PKCS8EncodedKeySpec(decoded));
        return priKey;
    }

    public static RSAPublicKey buildRsaPublicKey(String publicKey) throws Exception {
        byte[] decoded = Base64.decodeBase64(publicKey);
        RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance(RSA_ALGORITHM).generatePublic(new X509EncodedKeySpec(decoded));
        return pubKey;
    }

    public static String encryptByRsa(String content) throws Exception {
        byte[] decoded = Base64.decodeBase64(LOGIN_RSA_PUBLIC_KEY);
        RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance(RSA_ALGORITHM).generatePublic(new X509EncodedKeySpec(decoded));
        Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        String outStr = Base64.encodeBase64String(cipher.doFinal(content.getBytes(SysConstantsEnum.SYS_ZFJ.getValue())));
        return outStr;
    }

    public static String decryptByRsa(String secretContent) throws Exception {
        byte[] inputByte = Base64.decodeBase64(secretContent.getBytes(SysConstantsEnum.SYS_ZFJ.getValue()));
        byte[] decoded = Base64.decodeBase64(LOGIN_RSA_PRIVATE_KEY);
        RSAPrivateKey priKey = (RSAPrivateKey) KeyFactory.getInstance(RSA_ALGORITHM).generatePrivate(new PKCS8EncodedKeySpec(decoded));
        Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, priKey);
        String outStr = new String(cipher.doFinal(inputByte));
        return outStr;
    }

    public static String encodeBySHA256(String str) {
        if (StringUtils.isEmpty(str)) return null;
        return Hex.encodeHexString(DigestUtils.sha256(str));
    }

    public static String encryptUserPwdBySalt(String userPwd) {
        if (StringUtils.isBlank(userPwd)) return null;
        String userPwdSalt = USER_PWD_SALT_PREFIX + userPwd + USER_PWD_SALT_SUFFIX;
        return encodeBySHA256(userPwdSalt);
    }

    /**
     * 初始化人员密码
     */
    public static String encryptUserPwdInit(){
        String userPwdSalt = USER_PWD_SALT_PREFIX + SysConstantsEnum.SYS_INIT_PASS.getValue() + USER_PWD_SALT_SUFFIX;
        return encodeBySHA256(userPwdSalt);
    }

    public static void genKeyPair() throws NoSuchAlgorithmException {
        // KeyPairGenerator类用于生成公钥和私钥对，基于RSA算法生成对象
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        // 初始化密钥对生成器，密钥大小为2048位
        keyPairGen.initialize(2048, new SecureRandom());
        // 生成一个密钥对，保存在keyPair中
        KeyPair keyPair = keyPairGen.generateKeyPair();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();   // 得到私钥
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();  // 得到公钥
        String publicKeyString = new String(Base64.encodeBase64(publicKey.getEncoded()));
        // 得到私钥字符串
        String privateKeyString = new String(Base64.encodeBase64((privateKey.getEncoded())));
        System.out.println("公钥");
        System.out.println();
        System.out.println(publicKeyString);
        System.out.println();

        System.out.println("私钥");
        System.out.println();
        System.out.println(privateKeyString);
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        //genKeyPair();
        String aa = encryptByRsa("wangjinyu19941234564@#@$");
        System.out.println(aa);
        System.out.println(aa.length());
        System.out.println(decryptByRsa(aa));
        System.out.println(encryptUserPwdBySalt(aa));
    }

}
