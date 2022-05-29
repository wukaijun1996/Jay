package src.About_DateTime;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class JDK8DateTimeTest {


    /**
     *
     * DateTimeFormatter:格式化或解析日期时间
     * 类似于SimpleDateFormat
     *
     */
    @Test
    public void test2(){


        final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        final LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(formatter.format(localDateTime));
        //解析  字符串--》日期
        final TemporalAccessor parse = formatter.parse("2022-05-29T20:53:30.245");
        System.out.println(parse);

        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(localDateTime));

        //方式3：重点
        final DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");  //2022-05-29 11:17:59
        final String s = formatter1.format(LocalDateTime.now());
        System.out.println(s);

    }

    /**
     * localDate
     * localTime
     * localDateTime
     */
    @Test
    public void test1() {

        final LocalDate localDate = LocalDate.now();
        final LocalTime localTime = LocalTime.now();
        final LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);  //2022-05-29
        System.out.println(localTime);  //20:05:33.790
        System.out.println(localDateTime);  //2022-05-29T20:05:33.790


        //of（）设置定义的年月日时分秒  没有偏移量
        final LocalDateTime localDateTime1 = LocalDateTime.of(2022, 5, 29, 20, 05, 30);
        System.out.println(localDateTime1);

        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());

        //设置日期时间 ,体现不可变性
        final LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);


        //在现有的时间基础加上plus(时间)
        final LocalDateTime localDateTime2 = localDateTime.plusDays(2);
        System.out.println(localDateTime2);

        //在现有的时间基础减去minusTime(时间)
        final LocalDateTime localDateTime3 = localDateTime.minusDays(2);
        System.out.println(localDateTime3);


    }
}
