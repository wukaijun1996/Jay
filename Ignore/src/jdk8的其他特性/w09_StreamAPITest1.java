import org.junit.Test;

import java.nio.channels.ClosedByInterruptException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class w09_StreamAPITest1 {

    /*
    筛选与切片
     */
    @Test
    public void test1() {

        List<Employee> list = EmployeeData.getEmployees();

        //filter（Predicate p） -接收Lambda,从流中排除某些元素
        Stream<Employee> employeeStream = list.stream();

//        Stream<Employee> employeeStream1 = employeeStream.filter(new Predicate<Employee>() {
//            @Override
//            public boolean test(Employee employee) {
//                return employee.getSalary() > 7000;
//            }
//        });
//        用lambda表达式
        Stream<Employee> employeeStream1 = employeeStream.filter(employee -> employee.getSalary() > 7000);
//        employeeStream1.forEach(new Consumer<Employee>() {
//            @Override
//            public void accept(Employee employee) {
//                System.out.println(employee);
//            }
//        });
        //用lambda表达式
        employeeStream1.forEach(System.out::println);
        System.out.println("************************");
        //limit(n) -载断流，使其元素不超过给定数量
        Stream<Employee> employeeStream2 = list.stream();
        employeeStream2.limit(2).forEach(System.out::println);
        System.out.println("************************");

        //skip(n) - 跳过元素，返回一个扔掉了前n 个元素的流，若流中不足n个，则返回一个空流
        list.stream().skip(2).forEach(System.out::println);
        System.out.println("************************");
        list.stream().skip(10).forEach(System.out::println);
        //distinct() - 筛选，通过流所生成元素的hashCode()  equals()  去除重复元素
        System.out.println("************************");

        list.add(new Employee(8888, "刘强东", 100, 8888));
        list.add(new Employee(8888, "刘强东", 100, 8888));
        list.add(new Employee(8888, "刘强东", 100, 8888));
        list.add(new Employee(8888, "刘强东", 100, 8888));
        list.add(new Employee(8888, "刘强东", 100, 8888));

        list.stream().distinct().forEach(System.out::println);

    }

    //映射
    @Test
    public void test2() {

        /*
           map(function f) 接受一个函数作为参数，将元素转换成其他形式或提取信息
         */
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

        //获取员工姓名长度大于3的员工的姓名
        List<Employee> employeeList = EmployeeData.getEmployees();
        Stream<String> nameStream = employeeList.stream().map(employee -> employee.getName());
        nameStream.filter(name -> name.length() > 3).forEach(System.out::println);
        //exec2
        Stream<Stream<Character>> streamStream = list.stream().map(str -> fromStringToStream(str));
        streamStream.forEach(s -> {
            s.forEach(System.out::println);
        });
        System.out.println("********************");
        //flatMap(Function f)  - 接受一个函数作为参数,(集合里面套集合遍历用这种)
        Stream<Character> characterStream = list.stream().flatMap(w01_StreamAPITest1::fromStringToStream);
        characterStream.forEach(System.out::println);

    }

    //将字符串中的多个字符构成的集合转换成对应的Stream的实例
    public static Stream<Character> fromStringToStream(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }

    //排序
    @Test
    public void test3() {

        //sorted--自然排序
//        List<Integer> list = Arrays.asList(32, 13, 54, 23, 75, 13, 55, 99);
//        list.stream().sorted().forEach(System.out::println);

        //抛异常，没有 实现Comparable接口
//        List<Employee> employees = EmployeeData.getEmployees();
//        employees.stream().sorted().forEach(System.out::println);

        //sorted（Comparator com）--定制排序
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().sorted((e1, e2) -> {
            int ageValue = Integer.compare(e1.getAge(), e2.getAge());
            if (ageValue != 0) {
                return ageValue;
            } else {
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        }).forEach(System.out::println);

    }
}
