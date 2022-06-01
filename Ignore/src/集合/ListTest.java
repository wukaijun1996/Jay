package src.集合;

import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {


    @Test
    public void test1() {

        int a = 8;
//        System.out.println(a >> 1);//左移除2
//        System.out.println(Math.max(2.1, 3));
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(new String("Bob"));
        list.add(new Person("Giao", 20));
        list.add(456);

        System.out.println(list);

        //void add(int index,Object ele) 在index位置插入ele元素
        list.add(1,"BB");
        System.out.println(list);

        //boolean addAll(int index,Collection eles)
        List list1 = Arrays.asList(1, 2, 3);
        System.out.println(list.addAll(list1)); //依次加入
//        System.out.println(list.add(list1));
        System.out.println(list);

        //Object get(int index) 获取指定index位置的元素
        System.out.println(list.get(1));

    }
    @Test
    public void test2() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(new String("Bob"));
        list.add(new Person("Giao", 20));
        list.add(456);

        //int indexOf(Object obj)在集合中首次出现的位置
        System.out.println(list.indexOf(456));
        System.out.println(list.lastIndexOf(456));

        //remove(int index) 移除指定index位置的元素  并返回此元素
        System.out.println(list.remove(1));
        System.out.println(list);

        //Object set(int index,Object ele) 设置指定index位置的元素为ele
        list.set(1,"CC");
        System.out.println(list);

        //list Sublist(fromIndex,engIndex)
        System.out.println(list.subList(1, 3));


    }



}
