package com.xiaoyu.common.base.util;

import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import org.apache.commons.net.util.Base64;

/**
 * WJY
 * 公钥私钥生成工具
 */
public class SecretUtil {

    private final static String RSA_ALGORITHM = "RSA";
    public final static String RSA_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxT3ubvgwpKxl7AWF0hof2KDz1ZWllQZevWlf00BkL/vv94LgspcXFV7F6aRLU2n55DtRd8/sD5+t5IgWsVyF6nYCa7mbUVoomL6/Yoh4c7uIOcw8r7XQsZKY73qNbcu22HLIl0bGYaE/95TKsgYzYUushC8sJp7UxQ3rn2yZsCz8C54B5zSNraAJIMtRg9pIlMrIWFXohqlUS4ZJAbGX/NIAJS3oJzJbCCXlsN3ev0KJcWMIohfl+QklPodPlv5yflFlNyVRyvoM7HVK+5Uy5fLM3tCiuxuhM7MVoxQdCRxXYqkcGsQpJ4ECKQ70izlRBxTM0LrTDViryGGzOeUXXwIDAQAB";
    public final static String RSA_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDFPe5u+DCkrGXsBYXSGh/YoPPVlaWVBl69aV/TQGQv++/3guCylxcVXsXppEtTafnkO1F3z+wPn63kiBaxXIXqdgJruZtRWiiYvr9iiHhzu4g5zDyvtdCxkpjveo1ty7bYcsiXRsZhoT/3lMqyBjNhS6yELywmntTFDeufbJmwLPwLngHnNI2toAkgy1GD2kiUyshYVeiGqVRLhkkBsZf80gAlLegnMlsIJeWw3d6/QolxYwiiF+X5CSU+h0+W/nJ+UWU3JVHK+gzsdUr7lTLl8sze0KK7G6EzsxWjFB0JHFdiqRwaxCkngQIpDvSLOVEHFMzQutMNWKvIYbM55RdfAgMBAAECggEAP0ujgzrkKUQlpPsUuZqmk5b7CJRwQYV8y53QIXOtcvSPSkdWohj4UGRMcLDHd2ovxfz/JMq1f0IHxKmjVqFRXC8okbdLT2z2UCYONqmCtej9S0buRpi68vEPYPJcBlr0Pzt+gYU1zki3xVSbQ0vYGyX0o6qbqX0Y3G+eKFfqbe1Bbk3Ayfm2qy59WRyKEfDaVvvLcqB0GUi4Jsl8PZsJu6L300k02TFOfA9v5Tx8ZNxrHh0G9+wJcX0sZ0EN1ax4usjQezU5aACkp2ZMjz5vQLc1hd/1IjljvqjwSx6knzhSWX0/PdDJQKN2zbk+XHlqiUJosuy94QoG3Gzz6+0fuQKBgQDi/qnoQmHNvCM9TSRNjt3cT1bsKtxtSQcMp6yU+QkO0eXAKMlB6UaZsonem9CBU/N5PEoEqQbJRBdDhfHTPeF8oSKFXUR1/1eZRuIFVCLXWbg1VT8fP92r8BMeAZyPxLCV71LZjfDsyfvtRlSupLp2HnpfKM8ERnvgi1iWWuid5QKBgQDecgHnFSICYdNcUbySHSThhNVLtY1cydCRC9g0qNt5P/9B/cStOVq2J9RjDKxB1QFH/+0rTYtCQKphuM9EfeUME2FyrPQF1iapWfK0fYZQgWbigb9wu8lVaghxyxXoOM8c56ZxjCGHTmexF9kOaMryAPknweE1NgwcEg6Gey7r8wKBgGdnFsMEqkTr9SmRoH3sHMilI7WFeNAXuixbnVRndWbY2s4ERlnOCCkvmXpchEjFk12gxx8EWGEKsYZC1/wgbj01seIKsIsH/EGIdqFyyERNTIqPAKgdkb8nJ649kbI0KTTDxnvwGtXi1O4rYZwE0iPIknoSvur1qKyLDZnAY8K5AoGBALJa0QG6ZQlp7HFSLBMvgPm9atQIXq7uNeeGirU2Srs+P+lmkoKdwQjaiKVebONf6WYUYtJcm3LkrHgsGSv+kV8MTw8Gc6YWXetdboefOclk59xnUdsPBlAQ83Jh9k+69P1lE4Rpahy2FdfdmjC+fzJo610gS/VBP5ZmN/VF4YpXAoGBANQyf7Ozd/c43D5Dz/Y3iR/QTnsRjzvKk11XNHUHYsAlOWhVQwt/WNioKRyAmgz/KgSM97j/CiWFK7UDyhZJ59reGcqPo0xJqeswdhBPUc7Y+KIv5lttp3Qm78E6ADeXHJMz0wMp1nmgv55ERBB9W0r9pj6XKBdOcvZE0BddT9fL";

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

    public static void genKeyPair() throws NoSuchAlgorithmException {
        // KeyPairGenerator类用于生成公钥和私钥对，基于RSA算法生成对象
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        // 初始化密钥对生成器，密钥大小为96-1024位
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

    public static void main(String[] args) throws NoSuchAlgorithmException {
        genKeyPair();
    }

}
