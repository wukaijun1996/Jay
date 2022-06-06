package src.集合;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @Time : 2022/6/6 23:23
 * @Author : wu
 * @File : PropertiesTest.java
 * @Software: IntelliJ IDEA
 */
public class PropertiesTest {

    //Properties：用来处理配置文件
    public static void main(String[] args)  {

        FileInputStream fileInputStream = null;
        try {
            Properties properties = new Properties();

            fileInputStream = new FileInputStream("jdbc.properties");

            properties.load(fileInputStream);//加载流对应的文件

            System.out.println(properties.getProperty("name"));
            System.out.println(properties.getProperty("password"));
            System.out.println(properties.getProperty("13d"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (fileInputStream!= null){

                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
