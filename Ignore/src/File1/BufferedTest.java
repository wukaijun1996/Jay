package src.File1;

import org.junit.Test;

import java.io.*;

/**
 * @Time : 2022/6/9 20:48
 * @Author : wu
 * @File : BufferedTest.java
 * @Software: IntelliJ IDEA
 */
public class BufferedTest {

    @Test
    public void BufferedStreamTest(){

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File srcfile = new File("IMG_3749.PNG");
            File destfile = new File("IMG_3749_copy.PNG");

            //造节点流
            FileInputStream fileInputStream = new FileInputStream(srcfile);
            FileOutputStream fileOutputStream = new FileOutputStream(destfile);

            //造缓冲流
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] buffer = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(buffer))!= -1){
                bufferedOutputStream.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bufferedOutputStream!= null){
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //实现文件复制的方法
    public void copyFileWithBuffed(String srcPath, String destPath){


        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File srcfile = new File(srcPath);
            File destfile = new File(destPath);

            //造节点流
            FileInputStream fileInputStream = new FileInputStream(srcfile);
            FileOutputStream fileOutputStream = new FileOutputStream(destfile);

            //造缓冲流
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] buffer = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(buffer))!= -1){
                bufferedOutputStream.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bufferedOutputStream!= null){
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void testcopyFileWithBuffed() {
        long start = System.currentTimeMillis();
        String srcPath = "Git-2.32.0.2-64-bit.exe";
        String destPath = "2041.exe";

        copyFileWithBuffed(srcPath,destPath);
        long end = System.currentTimeMillis();
        System.out.println("复制所花的时间为：" + (end - start)); //163
    }


    /*
    使用BufferedReader和 BufferedWriter实现文本文件的复制
     */
   @Test
   public void testBufferedReaderBufferedWriter(){

       BufferedReader bufferedReader = null;
       BufferedWriter bufferedWriter = null;
       try {
           bufferedReader = new BufferedReader(new FileReader(new File("dbcu.txt")));
           bufferedWriter = new BufferedWriter(new FileWriter(new File("dbcu_copy.txt")));

           //方式一
//           char[] cbuf = new char[1024];
//           int len;
//           while ((len= bufferedReader.read(cbuf))!= -1){
//               bufferedWriter.write(cbuf);
//           }

           //方式二 使用String
           String data;
           while ((data = bufferedReader.readLine())!= null){
               //方法1
               bufferedWriter.write(data + "\n");
//               //方法2
//               bufferedWriter.write(data );
//               bufferedWriter.newLine(); //提供换行的操作

           }

       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           if (bufferedReader!= null){
               try {
                   bufferedReader.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
           if (bufferedWriter!= null){
               try {
                   bufferedWriter.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }
   }


}
