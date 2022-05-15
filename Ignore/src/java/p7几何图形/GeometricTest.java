package src.java.p7几何图形;

public class GeometricTest {

    public static void main(String[] args) {

        GeometricTest geometricTest = new GeometricTest();

        Circle c1 = new Circle(2.3,"white",1.0);
        geometricTest.displayGeometricObject(c1);
        Circle c2 = new Circle(3.3,"white",1.0);
        geometricTest.displayGeometricObject(c2);




    }

    public void displayGeometricObject(GeometricObject o){
        System.out.println("面积为：" + o.findArea());
    }

    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }


}
