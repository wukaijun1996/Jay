package src.java.p16接口练习_比较对象大小;

public class CompareableCircle extends Circle implements CompareObject {
    public CompareableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof CompareableCircle) {
            CompareableCircle c = (CompareableCircle) o;

            //return (int) (this.getRadius() - c.getRadius());  //精度损失
            //return this.getRadius() - c.getRadius() > 0 ? 1 : -1;
//            if (this.getRadius()>c.getRadius()){
//                return 1;
//            }else if (this.getRadius()<c.getRadius()){
//                return -1;
//            }else {
//                return 0;
//            }
            return this.getRadius().compareTo(c.getRadius());
        } else {
//            return 0;
            throw new RuntimeException("传入的数据类型不匹配");
        }
    }
}
