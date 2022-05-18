package src.java.p10_static的应用举例;

public class CircleTest {


    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println("c1的id " + c1.getId());
        System.out.println("c2的id " + c2.getId());
        System.out.println("创建圆的个数为： " + Circle.getTotal());


    }


}


class Circle {
    private double radius;
    private int id;

    private static int total;
    private static int init = 1001;

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this.radius = radius;
        id = init++;
        total++;
    }

    public double findArea() {
        return 3.14 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }
}

