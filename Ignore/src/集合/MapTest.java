package src.集合;

import org.junit.Test;

import javax.swing.*;
import java.util.*;

/**
 * Map:双列数据，存储Key-value对的数据，
 *      HashMap  作为Map主要的实现类：线程不安全的，效率高；存储null的key和value.
 *          LinkedHashMap  保证在遍历map元素时，可以按照添加的顺序是先遍历
 *          原因：在原有的HashMap底层结构基础上，添加了一对指针，指向前一个和后一个元素
 *      TreeMap   保证按照添加的key-value对进行排序，实现排序遍历此时考虑key的自然排序和定制排序
 *      底层使用红黑树
 *      Hashtable 作为Map古老的实现类：线程安全的，效率低；
 *          Properties  key value都是String类型
 */
public class MapTest {

    /*
    定制排序
     */
    @Test
    public void test6() {
        TreeMap map1 = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                }
                throw new RuntimeException("输入的类型不匹配");
            }
        });
        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 32);
        User u3 = new User("Jack", 20);
        User u4 = new User("Rose", 18);

        map1.put(u1, 98);
        map1.put(u2, 89);
        map1.put(u3, 76);
        map1.put(u4, 100);

        Set entrySet = map1.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object o = iterator1.next();
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getValue() + "----" + entry.getKey());
        }

    }


    /*
    自然排序
     */
    @Test
    public void test5() {

        TreeMap map = new TreeMap();
        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 32);
        User u3 = new User("Jack", 20);
        User u4 = new User("Rose", 18);

        map.put(u1, 98);
        map.put(u2, 89);
        map.put(u3, 76);
        map.put(u4, 100);

        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object o = iterator1.next();
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getValue() + "----" + entry.getKey());
        }
    }


    @Test
    public void test4() {

        Map map = new HashMap();
        map.put("AA", 123);
        map.put(45, 123);
        map.put("BB", 56);

        //遍历所有的key集：keySet()
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Object o : map.keySet()) {
            System.out.println(o);
        }

        System.out.println();
        //遍历所有的value集 values
        Collection values = map.values();
        for (Object o : values) {
            System.out.println(o);
        }
        System.out.println();

        //遍历所有的key-value
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object o = iterator1.next();
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getValue() + "----" + entry.getKey());
        }
        System.out.println();

        //方式2
        Set keySet = map.keySet();
        Iterator iterator2 = keySet.iterator();
        while (iterator2.hasNext()) {
            Object key = iterator2.next();
            Object values1 = map.get(key);
            System.out.println(key + "====" + values1);

        }


    }


    @Test
    public void test3() {

        Map map = new HashMap();
        map.put("AA", 123);
        map.put(45, 123);
        map.put("BB", 56);

        //get
        System.out.println(map.get(445));

        //containsKey
        System.out.println(map.containsKey("BB"));

        System.out.println(map.containsValue(123));

        System.out.println(map.isEmpty());
    }


    /*
    添加删除修改
     */
    @Test
    public void test2() {
        Map map = new HashMap();
        map.put("AA", 123);
        map.put(45, 123);
        map.put("BB", 56);
        map.put("AA", 87);

        System.out.println(map);

        //put
        HashMap map1 = new HashMap();
        map1.put("CC", 123);
        map1.put("DD", 123);

        //putAll
        map.putAll(map1);

        System.out.println(map);

        //remove
        Object value = map.remove("CC");
        System.out.println(value);

        System.out.println(map);

        //clear
        map.clear();

        System.out.println(map.size());
        System.out.println(map);

    }


    @Test
    public void test1() {

        Map map = new HashMap();
        map.put(null, null);

    }


}
