package src.java.p9_包装类;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

public class WrapperTest {

    // String类型转换为 基本数据类型，包装类
    @Test
    public void test5(){

        String str1 =  "123";
        int num1 = Integer.parseInt(str1);
        System.out.println(num1 + 3);

        String str2 = "asfd12";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);

    }


    //基本数据类型，包装类 转换为 String类型
    @Test
    public void test4(){
        int num1 = 10;
        //方式一
        String str1 = num1 + "";
        //方式2
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);

    }



    //自动装箱 自动拆箱
    @Test
    public void test3() {
//        int num1 = 10;
//        method(num1);

        //自动装箱
        int num2 = 10;
        Integer in1 = num2;

        boolean b1 = true;
        Boolean b2 = b1;

        //自动拆箱
        System.out.println(in1.toString());
        int num3 = in1;
    }

    public void method(Object obj) {
        System.out.println(obj);
    }


    //包装类到基本数据类型的转换：  调用包装类的xxxvalue()
    @Test
    public void test1() {
        Integer in1 = new Integer(12);
        int res = in1.intValue();
        System.out.println(res + 1);

        Float in2 = new Float(12.333);
        float res2 = in2.floatValue();
        System.out.println(res2);

    }

    @Test
    public void test2() {
        int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1);

        Integer in2 = new Integer("1234");
        System.out.println(in2.toString());

        Boolean b1 = new Boolean(null);
        System.out.println(b1);

        Boolean b2 = new Boolean("true");
        System.out.println(b2);


        Order order = new Order();
        System.out.println(order.isMale);
        System.out.println(order.Female);

    }


}

class Order {
    boolean isMale;
    Boolean Female;
}
