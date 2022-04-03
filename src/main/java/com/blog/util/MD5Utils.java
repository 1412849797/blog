package com.blog.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author 蔡梓阳
 * @Date 2022/4/3 20:47
 */
public class MD5Utils {



    public static String code(String str){

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] byteDigest = md.digest();
            int i ;
            StringBuilder buf = new StringBuilder();
            for (byte b:
                 byteDigest) {
                i = b;
                if (i<0){
                    i+=256;
                }
                if (i<16){
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            return buf.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }


    }


}
