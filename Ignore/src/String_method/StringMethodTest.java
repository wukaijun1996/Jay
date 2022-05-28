package src.String_method;

import org.junit.Test;

import java.util.Locale;

public class StringMethodTest {

    @Test
    public void test4() {

        //替换
        String str1 = "决战到天亮天天向上";
        String str2 = str1.replace("天", "地");

        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1.replace("决战","奋斗");
        System.out.println(str3);

        System.out.println("======================");

        String str = "12hello34world5java7891mysql456";

        System.out.println(str.replaceAll("\\d+", ",").replaceAll("^,|,$",""));  //使用正则表达式替换符合的全部字符串
        System.out.println(str.replaceFirst("\\d+", ",").replaceFirst("^,|,$",""));  //使用正则表达式替换符合的第一个字符串,

        System.out.println("======================");

        String str4 = "12345";
        boolean matches = str4.matches("\\d+");
        System.out.println(matches);

        String tel = "0571-4534289";
        boolean result = tel.matches("0571-\\d{7,8}");
        System.out.println(result);

        System.out.println("======================");

        String str5 = "hello|world|java";
        String[] strings = str5.split("l");
        System.out.println(strings.length);
        int j = 0;
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
            j++;
        }
        System.out.println(j);


    }




        @Test
    public void test3(){

        String str1 = "HelloWorld";
        System.out.println(str1.endsWith("ld"));

        System.out.println(str1.startsWith("Hello"));

        System.out.println(str1.startsWith("oW",4));

        String str2 = "loW";
        System.out.println(str1.contains(str2));

        System.out.println(str1.indexOf("e",5));   //指定字符串第一次出现处的索引
        System.out.println(str1.lastIndexOf("l"));


    }



    @Test
    public void test2(){
        String s1 = "HelloWorld";
        String s2 = "helloworld";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));  //忽略大小写比较

        String s3 = "abc";
        String s4 = s3.concat("def");  //连接两个字符串
        System.out.println(s4);

        String s5 = "abc";
        String s6 = new String("abe");
        System.out.println(s5.compareTo(s6));

        System.out.println("======================");

        String s7 = "你打的牌真是太好了";
        String s8 = s7.substring(2);
        String s9 = s7.substring(2,4);   //截取字符串[begin,end)
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9);


    }


    @Test
    public void test1(){

        String s1 = "Helloworld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(9));
        System.out.println(s1.isEmpty());
        System.out.println(s1.toUpperCase());

        String s2 = "  hell  owor  ld   ";
        System.out.println(s2.trim());   //去除首末位空格


    }


}
