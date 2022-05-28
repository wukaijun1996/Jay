package src.String_method;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest {


    /*
编码：  String  与 byte[]之间的转换  ---> 调用String 的getBytes()
解码：  byte[] -》 String  调用String的构造器
 */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String str1 = "abc123中国";
         byte[] bytes = str1.getBytes();
        System.out.println(Arrays.toString(bytes));

        final byte[] gbks = str1.getBytes("gbk"); //使用gbk字符集进行编码
        System.out.println(Arrays.toString(gbks));

        System.out.println("***************************");

        final String s = new String(bytes);
        System.out.println(s);


        final String s1 = new String(gbks);
        System.out.println(s1);  //出现乱码 原因：编码集和解码集不一致


        final String s2 = new String(gbks,"gbk");
        System.out.println(s2);

    }





    /*
    String  与 char[]之间的转换  ---> 调用String 的toCharArray()
char[] -》 String  调用String的构造器
     */
    @Test
    public void test2(){

        String str1 = "abc123";
        char[] chars = str1.toCharArray();
        System.out.println(Arrays.toString(chars));

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i] + "==");
        }

        char[] chars1= new char[]{'h','e','l','l','o'};
        String str2 = new String(chars1);
        System.out.println(str2);


    }







    @Test
    public void test1(){

        String str1 = "123";
        int num = Integer.parseInt(str1);
        System.out.println(num);

        int num1 = 123;
        String string = String.valueOf(num1);
        System.out.println(string);


    }





}
