package src.集合;

import org.junit.Test;

import java.util.*;

/*
  Collection接口（单列集合，用来存储一个一个的对象）
        list接口(存储有序的 可重复的数据)
                ArrayList,LinkedList,Vector
        set接口（存储无序的，不可重复的数据）
                HashSet,LinkedHashSet,TreeSet
   Map接口（双列集合，用来存储一对一对的数据）
        HashMap ,LinkedHashMap,TreeMap, HashTable,Properties
                
    
*/

public class CollectionTest {

    @Test
    public void test1(){

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
