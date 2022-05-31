package src.集合;

import org.junit.Test;

import java.util.*;

public class CollectionTest {

    @Test
    public void test1() {

        Collection coll = new ArrayList();

        //add(object e) 将元素e添加到集合coll中
        coll.add("SS");
        coll.add("BB");
        coll.add(123);  //自动装箱
        coll.add(new Date());

        //size()： 获取添加的元素的个数
        System.out.println(coll.size()); // 4

        //addAll():
        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("CC");
        coll.addAll(coll1);
        System.out.println(coll.size());  // 6
        System.out.println(coll);

        coll.clear();

        //isEmpty()  判断当前集合是否为空
        System.out.println(coll.isEmpty());


    }

}
