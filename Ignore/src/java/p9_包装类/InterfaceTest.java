package p4;

import java.awt.desktop.SystemSleepEvent;

public class InterfaceTest {

    public static void main(String[] args) {

        System.out.println(Flyable.MAX_SPEED);

//        Plane plane = new Plane();
//        plane.fly();

    }


}

interface Flyable {

    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1; //省略public static final

    public abstract void fly();

    void stop(); //省略 public abstract

}

interface Attackable {

    void attack();
}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("By fly");
    }

    @Override
    public void stop() {
        System.out.println("driver stop");
    }
}

class Bullet extends Object implements Flyable,Attackable,CC{


    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}


interface AA{
    void method1();
}
interface BB{
    void method2();
}

interface CC extends AA,BB{

}











