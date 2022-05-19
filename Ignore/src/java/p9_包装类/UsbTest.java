package p4;

public class UsbTest {

    public static void main(String[] args) {

        Computer computer = new Computer();
        Printer printer = new Printer();

        computer.transferData(printer);

        //创建了接口的非匿名实现类的匿名对象
        computer.transferData(new Flash());

        System.out.println("*************");
        //创建了接口的匿名实现类的非匿名对象
        USB usb = new USB() {
            @Override
            public void start() {
                System.out.println("mm");
            }

            @Override
            public void end() {
                System.out.println("gg");
            }
        };
        computer.transferData(usb);

    }


}

class Computer {

    public void transferData(USB usb) {
        usb.start();

        System.out.println(".....wwww");

        usb.end();

    }

}


interface USB {
    void start();

    void end();
}

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("Flash start");
    }

    @Override
    public void end() {
        System.out.println("Flash end");
    }
}

class Printer implements USB {

    @Override
    public void start() {
        System.out.println("Printer start");
    }

    @Override
    public void end() {
        System.out.println("Printer end");
    }
}
