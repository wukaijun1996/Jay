package src.java.p17_Java中接口新特性;

public class SubClassTest {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();


        subClass.method2();
        subClass.method3();

        System.out.println("&&&&&&&");
        subClass.method();
        System.out.println("&&&&&&&");
        //接口中定义的静态方法 只能通过接口来调用
        CompareA.method1();

    }
}

class SubClass extends SuperClass implements CompareA, CompareB {
    public void method2() {
        System.out.println("SubClassA:上海");
    }
//    public void method3(){
//        System.out.println("SubClassA:wkj是");
//
//    }

    //在实现类的方法调用父类，接口中被重写的方法
    public void method() {
        method3();//调用自己定义的重写的方法
        super.method3();//调用父类声明的方法
        //调用接口中的默认方法
        CompareA.super.method3();
        CompareB.super.method3();
    }

}