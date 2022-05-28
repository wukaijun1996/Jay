package src.String_method;

import org.junit.Test;

import java.util.Date;

public class DateTime_test {

    @Test
    public void test2(){


         java.sql.Date date2 = new java.sql.Date(25004814156L);

        System.out.println(date2);
    }


    @Test
    public void test1(){


        long time = System.currentTimeMillis();
        System.out.println(time); //1653740511583

         Date date1 = new Date();
        System.out.println(date1.getTime()); //1653740511585
        System.out.println(date1); //Sat May 28 20:21:51 CST 2022
    }



}
