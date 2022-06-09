package src.File1;

import org.junit.Test;

import java.io.*;

/**
 * 一，流的分类：
 * 1.操作数据单位：字节流，字符流
 * 2.数据的流向：输入流，输出流
 * 3.流的角色：节点流，处理流
 * <p>
 * 二，流的体系结构
 * 抽象基类                 节点流（或文件流）      缓冲流(处理流的一种)
 * InputStream（字节流）       FileInputStream     BufferedInputStream
 * OutputStream （字节流）     FileOutputStream    BufferedOutputStream
 * Reader  （字符流）          FileReader          BufferedReader
 * Writer  （字符流）          FileWriter          BufferedWriter
 */

public class FileReaderWriterTest {

    /*
    文件的复制；
    不能使用字符流来处理图片等字节数据
     */
    @Test
    public void testFileReaderFileWriter() {

        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");

            fileReader = new FileReader(srcFile);
            fileWriter = new FileWriter(destFile);

            char[] cbuf = new char[5];
            int len;//记录每次读入到cbuf数组中的字符的个数
            while ((len = fileReader.read(cbuf)) != -1){
                fileWriter.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader!= null){
                        fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (fileWriter!= null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

    //从内存中写出数据到硬盘的文件里
    @Test
    public void testFileWriter(){

        FileWriter fileWriter = null; //append （true）在文件末尾追加
        try {
            File file = new File("hello1.txt");
            fileWriter = new FileWriter(file,true);

            fileWriter.write("I have a dream!\n");
            fileWriter.write("you need to have a dream!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null){

                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }




    //对read()操作升级，使用read()的重载方法
    @Test
    public void test2() {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");
            fr = new FileReader(file);

            //读入的操作
            //read(char[] cbuf) ：返回每次读入cbuf数组中的字符的个数,如果到文件末尾，返回-1
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1){
                //方式一
//                for (int i = 0; i < len; i++) {
//                    System.out.print(cbuf[i]);
//                }
                //方式二
                String s = new String(cbuf, 0, len);
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }


    @Test
    public void test1() {
        FileReader fr = null;
        try {
            File file = new File("hello.txt"); //实例化File类的对象
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.exists());

            //提供具体的流
            fr = new FileReader(file);
            //数据的读入read()   返回读入的一个字符，如果达到文件末尾，返回-1
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
