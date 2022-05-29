package src.About_DateTime;


import org.junit.Test;

import java.security.interfaces.DSAPublicKey;
import java.util.Arrays;

/**
 * 对多个对象进行排序，需要比较对象的大小
 * 可以使用接口  Comparable 和 Comparator
 *
 */
public class CompareTest {

    /**
     * Comparable接口的使用
     *
     */
    @Test
    public void test1(){

         String[] arr = {"AA", "KK", "TT", "BB", "ZZ", "DD",};
        Arrays.sort(arr);

        String a = "adfaad";

        System.out.println(a.compareTo("scv"));
        System.out.println(Arrays.toString(arr));


    }

}













