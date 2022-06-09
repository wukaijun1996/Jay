package src.File1;

/**
 * @Time : 2022/6/9 22:19
 * @Author : wu
 * @File : InputStreamReaderTest.java
 * @Software: IntelliJ IDEA
 */

import org.junit.Test;

import java.io.*;

/**
 转换流的使用：属于字符流
 InputStreamReader  将一个字节的输入流转换为字符的输入流
 OutputStreamWriter 将一个字符的输出流转换为字节的输出流
 2.作用：提供字节流与字符流的转换

 3.解码： 字节 --》 字符
 编码： 字符--》 字节

 */
public class InputStreamReaderTest {



    /*
     InputStreamReader  将一个字节的输入流转换为字符的输入流
     */
    @Test
    public void test1() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("dbcu.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

        char[] cbuf = new char[20];
        int len;
        while ((len= inputStreamReader.read(cbuf)) != -1){
            String s = new String(cbuf, 0, len);
            System.out.println(s);
        }

        inputStreamReader.close();
    }

    /*
    综合使用 InputStreamReader  OutputStreamWriter
     */
    @Test
    public void test2() throws Exception {

        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("dbcu.txt"), "UTF-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("dbcu_gbk.txt"), "gbk");

        char[] cbuf = new char[20];
        int len;
        while ((len = inputStreamReader.read(cbuf)) != -1){
            outputStreamWriter.write(cbuf,0,len);
        }

        inputStreamReader.close();
        outputStreamWriter.close();


    }




}
