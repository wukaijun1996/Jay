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
        HashMap ,LinkedHashMap,TreeMap, Hashtable,Properties
                
    
*/

public class
CollectionTest {

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

    @Test
    public void test2() {

        Collection col = new ArrayList();
        col.add(123);
        col.add(456);
        col.add(new String("Bob"));
        col.add(456);
        Person p = new Person("perry", 20);
        col.add(p);

        System.out.println(col);
        System.out.println(col.hashCode());

        //contains  在判断时会调用obj对象所在类的equals()方法
        boolean contains = col.contains(123);
        System.out.println(contains);
        System.out.println("========");
        System.out.println(col.contains(new String("Bob")));
        System.out.println("========");


        System.out.println(col.contains(p));
//        System.out.println(col.contains(new Persion("perry", 20)));

        System.out.println("containsAll===================");
        //containsAll(Collection coll1) :判断形参coll1中的所有元素是否都存在于集合中
        Collection coll1 = new ArrayList();
        Collection coll2 = Arrays.asList(123, 456);
        coll1.add(123);
        coll1.add(456);
        System.out.println(col.containsAll(coll1));
        System.out.println(col.containsAll(coll2));

    }

    @Test
    public void test3() {
        //remove(Object obj)  从当前集合中移除obj元素
        Collection col = new ArrayList();
        col.add(123);
        col.add(456);
        col.add(new String("Bob"));
        col.add(new Person("Giao", 20));
        col.add(false);

        System.out.println(col);
        System.out.println(col.remove(123));
        System.out.println(col);

        System.out.println("removeAll ===================");
        //removeAll(Collection coll1)    从当前集合中移除coll1中所有的元素
        Collection coll2 = Arrays.asList(123, 456);
        col.removeAll(coll2);
        System.out.println(col);

        System.out.println("retainAll()===================");
        //retainAll()  求交集
        col.add(123);
        col.retainAll(coll2);
        System.out.println(col);

        System.out.println("equals===================");
        //equals(Object obj)

    }

    @Test
    public void test4() {

        Collection col = new ArrayList();
        col.add(123);
        col.add(456);
        col.add(new String("Bob"));
        col.add(456);
        Person p = new Person("perry", 20);
        col.add(p);

        //hashCode() 返回当前对象的哈希值
        System.out.println(col.hashCode());

        //集合 --》 数组 toArray()
        Object[] arr = col.toArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //数组--》集合
        List strings = Arrays.asList(new String[]{"AA", "VV", "RR"});
        System.out.println(strings);

        //坑
        List strings1 = Arrays.asList(new int[]{111,222});  //此时把 new int[]{111,222} 当成一个元素
        System.out.println(strings1.size());  //1


        List strings2 = Arrays.asList(new Integer[]{123,456});
        System.out.println(strings2.size());  //2





    }

}
