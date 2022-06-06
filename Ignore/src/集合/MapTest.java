package d_集合;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Map:双列数据，存储Key-value对的数据，
 *     HashMap  作为Map主要的实现类：线程不安全的，效率高；存储null的key和value.
 *         LinkedHashMap  保证在遍历map元素时，可以按照添加的顺序是先遍历
 *                          原因：在原有的HashMap底层结构基础上，添加了一对指针，指向前一个和后一个元素
 *     TreeMap   保证按照添加的key-value对进行排序，实现排序遍历此时考虑key的自然排序和定制排序
 *                底层使用红黑树
 *     Hashtable 作为Map古老的实现类：线程安全的，效率低；
 *          Properties
 *
 *
 */
public class MapTest {


    @Test
    public void test3(){

        Map map = new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);

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
    public void test2(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
        map.put("AA",87);

        System.out.println(map);

        //put
        HashMap map1 = new HashMap();
        map1.put("CC",123);
        map1.put("DD",123);

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
    public void test1(){

        Map map = new HashMap();
        map.put(null,null);

    }



}
