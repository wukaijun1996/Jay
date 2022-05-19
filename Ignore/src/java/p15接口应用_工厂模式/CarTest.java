package src.java.p15接口应用_工厂模式;

public class CarTest {
    public static void main(String[] args) {

        Car a = new AudiFactory().getCar();
        a.run();
        Car b = new BydFactory().getCar();
        a.run();

    }
}


interface Car {
    public abstract void run();
}

//两个实现类
class Audi implements Car {

    @Override
    public void run() {
        System.out.println("奥迪在跑");
    }
}

class BYD implements Car {
    @Override
    public void run() {
        System.out.println("比亚迪在跑");
    }
}

//工厂接口
interface Factory {
    Car getCar();
}

//两个工厂类
class AudiFactory implements Factory {
    @Override
    public Audi getCar() {
        return new Audi();
    }
}

class BydFactory implements Factory {
    @Override
    public BYD getCar() {
        return new BYD();
    }
}








