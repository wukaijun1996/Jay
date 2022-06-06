package src.集合;

/**
 * @Time : 2022/6/6 23:39
 * @Author : wu
 * @File : CollectionsTest.java
 * @Software: IntelliJ IDEA
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * Collections:操作Collection(Set, List)，Map的工具类
 *
 */
public class CollectionsTest {

    @Test
    public void test2() {

        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(722);
        list.add(-97);
        list.add(0);

        List dest = new ArrayList(5);


//        List dest = Arrays.asList(new Object[list.size()]);
        System.out.println(dest.size());

//        Collections.copy(dest,list);

        System.out.println(dest);


        /*
        synchronizedList
        synchronizedMap
        使指定集合包装成线程同步的集合。
         */

        List list1 = Collections.synchronizedList(list);


    }


    @Test
    public void test1(){

        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(722);
        list.add(722);
        list.add(722);
        list.add(-97);
        list.add(0);

        System.out.println(list);

//        Collections.reverse(list); //翻转
//        Collections.shuffle(list); //随机排序
//        Collections.sort(list);  //自然排序
//        Collections.swap(list,2,3);
//        System.out.println(Collections.max(list));//最大值
        System.out.println(Collections.frequency(list, 722)); //某个元素出现的次数

        System.out.println(list);
    }


}
