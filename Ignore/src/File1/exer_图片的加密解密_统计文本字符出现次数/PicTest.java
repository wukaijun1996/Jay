package src.File1.exer_图片的加密解密_统计文本字符出现次数;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Time : 2022/6/9 21:29
 * @Author : wu
 * @File : PicTest.java
 * @Software: IntelliJ IDEA
 */
public class PicTest {

    //加密
    @Test
    public void test1() {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("IMG_3749.PNG");
            fileOutputStream = new FileOutputStream("IMG_3749_secret.PNG");

            byte[] buffer = new byte[20];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1) {
                //对字节数组进行修改
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }

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

    //解密
    @Test
    public void test2() {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("IMG_3749_secret.PNG");
            fileOutputStream = new FileOutputStream("IMG_3749_解密.PNG");

            byte[] buffer = new byte[20];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1) {
                //对字节数组进行修改
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }

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

}
