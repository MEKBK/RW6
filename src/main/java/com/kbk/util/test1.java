package com.kbk.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {
//        char[] cs1 = new char[32];
//
//        String s = "www.runoob.com";
//        char result = s.charAt(6);
//        System.out.println(result);



        for(int i = 0; i < 100; i++) {

            for(int j = 0; j < 10; i++) {
                String MD5 = test1.getMD5Str("123456");
                System.out.println(MD5);

                String a = "9698d96e9ee98c96a99d96";
                System.out.println("a长度"+a.length());
            }
        }

    }


    public static String getMD5Str(String password) {

        //生成一个16位的随机数

        Random random = new Random();

        StringBuilder stringBuilder = new StringBuilder(16);

        stringBuilder.append(random.nextInt(99999999)).append(99999999);

        int len = stringBuilder.length();

        if (len < 16) {

            for (int i = 0; i < 16 - len; i++) {

                stringBuilder.append("0");

            }

        }

        //生成最终的盐

        String salt = stringBuilder.toString();

        password = md5Hex(password+salt);

        char[] cs=new char[48];

        for(int i=0;i<48;i+=3){

            cs[i]=password.charAt(i/3*2);

            char c=salt.charAt(i/3);

            cs[i+1]=c;


            cs[i+2]=password.charAt(i/3*2+1);

        }
        System.out.println("长度"+password.length());
        return String.valueOf(cs);

    }


    /**

     * 实现字节数组和16位进制数的互转

     * @param str

     * @return

     */





    private static String md5Hex(String str){

        byte[] digest = null;

        try {
            // 获得MD5摘要算法的 MessageDigest对象
            MessageDigest md5 = MessageDigest.getInstance("md5");

            digest = md5.digest(str.getBytes("utf-8"));

            // 获得密文
            byte[] md = digest;
            // 把密文转换成十六进制的字符串形式
            StringBuffer buf = new StringBuffer();
            for (int i = 0; i < md.length; i++) {
                int tmp = md[i];
                if (tmp < 0) {
                    tmp += 256;
                }
                    if (tmp < 16) {
                        buf.append("0");
                    }

                buf.append(Integer.toHexString(tmp));
            }
            // return buf.toString().substring(8, 24);// 16位加密
            return buf.toString();// 32位加密
        } catch (Exception e) {
            throw new RuntimeException("没有md5这个算法！");
        }

    }



}
