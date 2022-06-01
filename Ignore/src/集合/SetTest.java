package src.集合;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Set接口：
 * HashSet:作为Set接口的主要实现类；线程不安全的，可以存储null值(数组+链表)
 *      LinkedHashSet: 作为HashSet的子类；遍历其内部数据时，可以按照添加的顺序遍历 ,  记录此数据的前一个数据和后一个数据
 * TreeSet：可以按照添加对象的指定属性。进行排序
 *
 * @Time : 2022/6/1 22:53
 * @Author : wu
 * @File : SetTest.java
 * @Software: IntelliJ IDEA
 */
public class SetTest {

    @Test
    public void test1() {

        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new User("lili", 12));
        set.add(new User("lili", 12));
        set.add(129);

        Iterator iterable = set.iterator();
        while (iterable.hasNext()) {
            System.out.println(iterable.next());
        }
    }

    //LinkedHashSet的使用
    //在添加数据的同时， 每个数据还维护了两个引用，记录此数据的前一个数据和后一个数据
    //LinkHashSet效率高于HashSet
    @Test
    public void test2() {

        Set set = new LinkedHashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new User("lili", 12));
        set.add(new User("lili", 12));
        set.add(129);

        Iterator iterable = set.iterator();
        while (iterable.hasNext()) {
            System.out.println(iterable.next());
        }

    }
}














