import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
了解类的加载器
 */
public class w02_ClassLoaderTest {

    @Test
    public void test1(){

        //对于自定义类 ，使用系统类加载器进行加载
        ClassLoader classLoader = w02_ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);
        //调用系统类加载器的getParent():获取扩展类加载器
        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);
        //调用扩展类加载器的getParent() 无法获取引导类加载器
        //引导类加载器主要负责java的核心类库，无法加载自定义类
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);

    }

    @Test
    public void test2() throws IOException {

        Properties properties = new Properties();
//        FileInputStream fileInputStream = new FileInputStream("jdbc.properties"); //文件默认在当前的module下
//        properties.load(fileInputStream);

        ClassLoader classLoader = w02_ClassLoaderTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("jdbc.properties");  ////文件默认在当前module的src下
        properties.load(resourceAsStream);


        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));




    }


}
