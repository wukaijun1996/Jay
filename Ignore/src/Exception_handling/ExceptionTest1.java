package src.Exception_handling;

import org.junit.Test;

public class ExceptionTest1 {


    @Test
    public void test1() {

        String str = "1234";
        str = "abc";


        try {
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
//            System.out.println("不要着急 ，出现数值转换异常了...");
//            System.out.println(e.getMessage()); //异常信息
            e.printStackTrace();//所有异常信息
        } catch (NullPointerException e) {
            System.out.println("不要着急 ，出现空指针异常了...");

        } catch (Exception e ) {
            System.out.println("所有异常的父类");
        } finally {
            System.out.println("7as7a");
        }


    }

}
