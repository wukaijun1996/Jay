package src.File1;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * windows:\\
 * unix: /
 *
 * @Time : 2022/6/7 22:03
 * @Author : wu
 * @File : FileTest.java
 * @Software: IntelliJ IDEA
 */
public class FileTest {

    @Test
    public void test7() {

        //文件目录的创建
        File file1 = new File("E:\\xx\\yy\\aa");
        boolean mkdir = file1.mkdir();
        if (mkdir){
            System.out.println("创建成功1");
        }else {
            file1.delete();
            System.out.println("删除成功1");
        }

        File file2 = new File("E:\\xx\\zz\\aa\\");
        boolean mkdir1= file2.mkdirs();
        if (mkdir1){
            System.out.println("创建成功2");
        }else {
            file2.delete();
            System.out.println("删除成功2");
        }


    }


    @Test
    public void test6() throws IOException {
        File file2 = new File("hello.txt");
        if (!file2.exists()){
           file2.createNewFile(); //创建文件
            System.out.println("创建成功");
        }else {
            file2.delete();
            System.out.println("删除成功");
        }
    }

    @Test
    public void test5() {
        File file2 = new File("C:\\Users\\wu.txt");

        //判断是否是文件目录
        System.out.println(file2.isDirectory());
        //判断是否是文件
        System.out.println(file2.isFile());
        //判断是否存在
        System.out.println(file2.exists());
        //判断是否可读
        System.out.println(file2.canRead());
        //判断是否可写
        System.out.println(file2.canWrite());
        //判断是否隐藏
        System.out.println(file2.isHidden());


    }


    @Test
    public void test4() {

        File file1 = new File("hello.txt");
        File file2 = new File("C:\\Users\\wu.txt");

        System.out.println(file1.renameTo(file2)); //将file1 所在文件剪切file2所在文件目录
    }


    @Test
    public void test3() {
        File file = new File("C:\\Users\\Administrator\\Desktop\\Jay");

//        String[] list = file.list();
//        for (String s :
//                list) {
//            System.out.println(s);
//        }

        for (String s : file.list()) { //目录下所有文件
            System.out.println(s);
        }

        System.out.println();
        File[] files = file.listFiles();
        for (File f:files) {
            System.out.println(f);
        }


    }

    @Test
    public void test2() {

        File file1 = new File("hello.txt");
        File file2 = new File("C:\\Users\\Administrator\\Desktop\\Jay\\hi.txt");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));

        System.out.println();

        System.out.println(file2.getAbsolutePath());  //绝对路径
        System.out.println(file2.getPath());  //获取路径
        System.out.println(file2.getName()); //此文件名
        System.out.println(file2.getParent()); //当前所在目录
        System.out.println(file2.length());  //文件长度
        System.out.println(new Date(file1.lastModified())); //最后一次的修改时间

    }


    @Test
    public void test1() {

        //构造器1
        File file = new File("C:\\Users\\Administrator\\Desktop\\Jay\\jdbc.properties");
        System.out.println(file);

        //构造器2
        File file1 = new File("C:\\Users\\Administrator", "Desktop");
        System.out.println(file1);

        //构造器3
        File file2 = new File(file1, "Jay\\jdbc.properties");
        System.out.println(file2);
    }
}
