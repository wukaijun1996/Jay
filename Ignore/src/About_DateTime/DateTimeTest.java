package src.About_DateTime;


import org.junit.Test;
import src.Project3.service.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 1.System类中currentTimeMillis();
 * 2.java.util.Date和子类java.sql,Date
 * 3.SimpleDateFormat
 * 4.Calendar
 *
 */
public class DateTimeTest {


    /**
     * Calendar日历类(抽象类)的使用
     */
    @Test
    public void testCalendar(){

        //实例化
        //方式1 ：创建其子类 （GregorianCalendar）的对象
        //方式2：调用其静态方法getInstance()
       Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());  //java.util.GregorianCalendar

        //常用方法
        //get()
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));

        //set()
        calendar.set(Calendar.DAY_OF_MONTH,22);  //对具体的字段进行设置
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,4);
         days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //getTime() 日历类 --》 Date
         Date date = calendar.getTime();
        System.out.println(date);
        System.out.println(date.getTime());

        //setTime()  Date --> 日历 类
        Date date1 = new Date();
        calendar.setTime(date1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

    }


    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        //格式化
        Date date = new Date();
        System.out.println(date);
        System.out.println(simpleDateFormat.format(date));

        //解析
        String str = "22-5-28 下午12:40";
        System.out.println(simpleDateFormat.parse(str));


        System.out.println("=====================");
        //自定义格式模式,调用带参的构造器
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("YYYY-'W'ww-u");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(simpleDateFormat1.format(date));
        System.out.println(simpleDateFormat2.format(date));


    }


}
