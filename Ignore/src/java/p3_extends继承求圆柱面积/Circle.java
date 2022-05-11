package src.java.p3_extends继承求圆柱面积;



public class Circle {

    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 返回圆的面积
     */
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
