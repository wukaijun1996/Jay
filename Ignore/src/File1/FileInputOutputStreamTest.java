package src.File1;

import org.junit.Test;

import java.io.*;

/**
 * @Time : 2022/6/9 20:19
 * @Author : wu
 * @File : FileInputOutputStreamTest.java
 * @Software: IntelliJ IDEA
 */
public class FileInputOutputStreamTest {

    @Test
    public void testFileInputStream() {


        FileInputStream fileInputStream = null;
        try {
            File file = new File("hello.txt");
            fileInputStream = new FileInputStream(file);

            byte[] buffer = new byte[5];
            int len;//记录每次读取的字节的个数
            while ((len = fileInputStream.read(buffer)) != -1) {
                String s = new String(buffer, 0, len);
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {

                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testFileInputOutputStream() throws FileNotFoundException {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            File srcfile = new File("IMG_3749.PNG");
            File destfile = new File("IMG_3749_copy.PNG");

            fileInputStream = new FileInputStream(srcfile);
            fileOutputStream = new FileOutputStream(destfile);

            byte[] buffer = new byte[5];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    //指定路径下文件的复制
    public void copyFile(String srcPath, String destPath) {


        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            File srcfile = new File(srcPath);
            File destfile = new File(destPath);

            fileInputStream = new FileInputStream(srcfile);
            fileOutputStream = new FileOutputStream(destfile);

            byte[] buffer = new byte[1024];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    @Test
    public void testCopyFile() {

        long start = System.currentTimeMillis();
        String srcPath = "Git-2.32.0.2-64-bit.exe";
        String destPath = "2041.exe";

        copyFile(srcPath,destPath);
        long end = System.currentTimeMillis();
        System.out.println("复制所花的时间为：" + (end - start)); //453


    }


}
