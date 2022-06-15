import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
内置的核心函数式接口
消费型接口Consumer<T>  void accept(T t)
供给型接口Supplier<T> T get()
函数型接口Function<T,R>  R apply(T t)
断定型接口Predicate<T>  boolean test(T t)


 */
public class w05_LambdaTest2 {

    @Test
    public void teest1() {

        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("买了瓶矿泉水，价格为：" + aDouble);
            }
        });
        System.out.println("*****************");

        happyTime(400, money -> System.out.println("买了瓶矿泉水，价格为：" + money));

    }

    public void happyTime(double money, Consumer<Double> con) {
        con.accept(money);
    }


    @Test
    public void test2() {

        List<String> list = Arrays.asList("北京", "天津", "南京", "东京", "西京", "普京");
        List<String> list1 = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(list1);

        System.out.println("*****************");
        List<String> list2 = filterString(list, s -> s.contains("京"));

        System.out.println(list2);

    }

    //根据规则，过滤集合中的字符串，此规则由Predicate的方法决定
    public List<String> filterString(List<String> list, Predicate<String> pre) {

        ArrayList<String> stringArrayList = new ArrayList<>();

        for (String s : list) {
            if (pre.test(s)) {
                stringArrayList.add(s);
            }
        }
        return stringArrayList;
    }


}
