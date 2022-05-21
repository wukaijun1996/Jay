package src.Exception_handling;

import org.junit.Test;

import java.io.File;

public class ExceptionTest {

    @Test
    public void test1(){

        //NullPointerException 空指针异常
//        int[] arr = null;
//        System.out.println(arr[4]);

        try {
            String str = "aAAAbvc";
            str = null;
            System.out.println(str.charAt(1));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }


    }



}
