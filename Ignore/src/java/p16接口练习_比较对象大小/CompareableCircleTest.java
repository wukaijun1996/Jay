package src.java.p16接口练习_比较对象大小;

public class CompareableCircleTest {
    public static void main(String[] args) {

        CompareableCircle c1 = new CompareableCircle(3.4);
        CompareableCircle c2 = new CompareableCircle(3.6);

        System.out.println(c1.compareTo(c2));

        int compareValue = c1.compareTo(new String("sa"));


    }
}
