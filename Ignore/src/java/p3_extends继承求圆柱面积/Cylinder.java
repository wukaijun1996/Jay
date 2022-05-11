package src.java.p3_extends继承求圆柱面积;



public class Cylinder extends Circle{

    private double length;

    public Cylinder() {
        length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 返回圆的面积
     * @return
     */
    public double findVolume(){
//        return Math.PI * getRadius() * getRadius() * getLength();
        return findArea() * getLength();
    }
}
