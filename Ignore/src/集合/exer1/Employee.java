package src.集合.exer1;

/**
 * @Time : 2022/6/5 22:41
 * @Author : wu
 * @File : Employee.java
 * @Software: IntelliJ IDEA
 */
public class Employee implements Comparable {
    private String name;
    private int age;
    private MyDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", birthday=" + birthday + '}';
    }

    //按照name排序
    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee e = (Employee) o;
            return this.name.compareTo(e.name);
        }
        throw new RuntimeException("传入的数据类型不一致！");
    }
}
