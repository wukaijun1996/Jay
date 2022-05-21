public class w15_圆的面积 {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.radius = 2.5;
//        System.out.println(circle.getArea());

        Circle circle1 = new Circle();
        circle1.radius = 3.5;
        circle1.setRadius();

    }
}
class Circle{
    double radius;
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public void setRadius() {
        double area = Math.PI * radius * radius;
        System.out.println("面积为" + area);

    }
}
