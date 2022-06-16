import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
stream的终止操作 和收集操作
 */
public class w10_StreamAPITest2 {

    //匹配与查找
    @Test
    public void test1() {
        List<Employee> employees = EmployeeData.getEmployees();

        //AllMatch(Predicate p) - 检查是否匹配所有元素
        System.out.println(employees.stream().allMatch(employee -> employee.getAge() > 18));
        //anyMatch(Predicate p) -检查是否至少匹配一个元素
        System.out.println(employees.stream().anyMatch(employee -> employee.getSalary() > 9000));
        //noneMatch(Predicate p) -检查是否没有匹配的元素
        System.out.println(employees.stream().noneMatch(employee -> employee.getName().contains("非")));
        //findFirst()  返回第一个元素
        System.out.println(employees.stream().findFirst());
        //findAny()  返回当前流的任意元素
        System.out.println(employees.parallelStream().findAny());
        //count 返回当前流的总个数
        System.out.println(employees.stream().filter(employee -> employee.getSalary() > 5000).count());
        //max(Comparator c)-返回流中最大值
        //返回最高的工资
        System.out.println(employees.stream().map(employee -> employee.getSalary()).max((e1, e2) -> e1.compareTo(e2)));
        //min(Comparator c)-返回流中最小值
        //返回工资最低的员工
        System.out.println(employees.stream().min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())));
        //forEach  -- 内部迭代
        employees.stream().forEach(System.out::println);

    }

    //归约
    @Test
    public void test2() {

        //reduce(T identity,BinaryOperator)  -  将流中元素反复结合起来，得到一个值
        //计算1-10累加的值
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        //写法1
//        Integer reduce = list.stream().reduce(0, new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                return Integer.sum(integer, integer2);
//            }
//        });
//        System.out.println(reduce);
        //写法2
        Integer reduce = list.stream().reduce(0, (integer, integer2) -> Integer.sum(integer, integer2));
        System.out.println(reduce);

        //reduce(BinaryOperator)
        //计算公司所有员工工资的总和
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Double> salaryStream = employees.stream().map(employee -> employee.getSalary());
        System.out.println(salaryStream.reduce((aDouble, aDouble2) -> Double.sum(aDouble, aDouble2)));
//        salaryStream.reduce(Double::sum);

    }


    //3.收集
    @Test
    public void test3() {

        //collect(Collector c) 将流转换成其他形式，接收一个Collector接口的实现，用于给Stream中元素做汇总的方法
        //查找工资大于6000的员工，结果返回一个list或Set

        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Employee> employeeStream = employees.stream().filter(employee -> employee.getSalary() > 6000);
        List<Employee> employeeList = employeeStream.collect(Collectors.toList());
        employeeList.forEach(System.out::println);
        System.out.println("*********************");
        Stream<Employee> employeeStream1 = employees.stream().filter(employee -> employee.getSalary() > 6000);
        Set<Employee> employeeSet = employeeStream1.collect(Collectors.toSet());
        employeeSet.forEach(System.out::println);


    }


}
