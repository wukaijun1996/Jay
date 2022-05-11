package src.java.p3_extends继承求圆柱面积;

public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder();

        cylinder.setLength(2.1);
        cylinder.setRadius(3.4);

        double volume = cylinder.findVolume();
        System.out.println("圆柱的面积为： " + volume);

        double area = cylinder.findArea();
        System.out.println("圆的面积为： " + area);

        do {
            System.out.println("niubi");
        }while (cylinder.getRadius() == 0);




    }
}
