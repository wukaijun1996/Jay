package src.集合;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合元素的操作，使用迭代器Iterator接口
 *iterator.next()
 * iterator.hasNext()
 *
 * @Time : 2022/5/31 23:33
 * @Author : wu
 * @File : IteratorTest.java
 * @Software: IntelliJ IDEA
 */
public class IteratorTest {

    @Test
    public void Test1(){

        Collection col = new ArrayList();
        col.add(123);
        col.add(456);
        col.add(new String("Bob"));
        col.add(new Person("Giao", 20));
        col.add(false);

        Iterator iterator = col.iterator();

        //方式1
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
        //报异常 NoSuchElementException
//        System.out.println(iterator.next());
        //方式2
//        for (int i = 0; i < col.size(); i++) {
//            iterator.next();
//        }

        //方式3
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
       @Test
    public void test2() {

        //测试Iterator中的remove（）
        Collection col = new ArrayList();
        col.add(123);
        col.add(456);
        col.add(new String("Bob"));
        col.add(new Persion("Giao", 20));
        col.add(false);

        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {

            if ("Bob".equals(iterator.next())) {
                iterator.remove();
            }
        }

        System.out.println("===================");
         iterator = col.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }


    }
}
