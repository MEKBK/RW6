package com.kbk.util;


import java.security.MessageDigest;
import java.util.Random;


/**
 *
 * @Description
 * @Author 况博凯
 * @Date 2021/03/08 22:56
 * @Version 2.0
 *
 */
public class MD5Util {

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

        password=md5Hex(password+salt);

        char[] cs=new char[48];

        for(int i=0;i<48;i+=3){

            cs[i]=password.charAt(i/3*2);

            char c=salt.charAt(i/3);

            cs[i+1]=c;

            cs[i+2]=password.charAt(i/3*2+1);

        }

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

    /**

     * 验证加盐后密码是否还相同

     * @param password

     * @param md5str

     * @return

     */

    public static boolean getSaltverifyMD5(String password, String md5str) {

        char[] cs1 = new char[32];

        char[] cs2 = new char[16];

        for (int i = 0; i < 48; i += 3) {

            cs1[i / 3 * 2] = md5str.charAt(i);

            cs1[i / 3 * 2 + 1] = md5str.charAt(i + 2);

            cs2[i / 3] = md5str.charAt(i + 1);

        }

        String Salt = new String(cs2);

        return md5Hex(password + Salt).equals(String.valueOf(cs1));

    }
}
