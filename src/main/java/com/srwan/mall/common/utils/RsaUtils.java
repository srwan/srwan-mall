package com.srwan.mall.common.utils;

import sun.misc.BASE64Decoder;

import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;

public class RsaUtils {

    public static final String RSA = "RSA";

    public static final String UTF8 = "UTF-8";

    public static final String JSON = "JSON";

    /*public static String privateEncrypt(String strPrivateKey,String source) throws  Exception{
        BASE64Decoder base64Decoder = new BASE64Decoder();
        byte[] keyByte = base64Decoder.decodeBuffer(strPrivateKey);
        PKCS8EncodedKeySpec s8ek = new PKCS8EncodedKeySpec(keyByte);
        KeyFactory keyFactory = KeyFactory.getInstance(RSA);
        PrivateKey privateKey = keyFactory.generatePrivate(s8ek);
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(1,privateKey);
        byte[] sbt = source.getBytes(UTF8);
        byte[] enByte = null;

        for (int i = 0; i < sbt.length;i += 64){
            byte[] doFinal = cipher.doFinal();
            //enByte = Add
        }
    }*/
}
