package com.test.util;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
public class HmacUtil {
 
    public static String SHA1(String str){  
        try {  
            //指定sha1算法  
            MessageDigest digest = MessageDigest.getInstance("SHA-1");  
            digest.update(str.getBytes());  
            //获取字节数组  
            byte messageDigest[] = digest.digest();  
            // Create Hex String  
            StringBuffer hexString = new StringBuffer();  
            // 字节数组转换为 十六进制 数  
            for (int i = 0; i < messageDigest.length; i++) {  
                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);  
                if (shaHex.length() < 2){  
                    hexString.append(0);
                }  
                hexString.append(shaHex);  
            }  
            return hexString.toString().toLowerCase();   
        } catch (NoSuchAlgorithmException e) {  
           return "";
        }  
    }  
}