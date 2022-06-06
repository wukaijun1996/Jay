package src.集合;

import java.util.Objects;

/**
 * @Time : 2022/6/1 23:14
 * @Author : wu
 * @File : User.java
 * @Software: IntelliJ IDEA
 */
public class User implements Comparable{
    private String name;
    private int age;

    public User() {
    }

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

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof User){
            User user =(User) o;
            int compare =  -this.name.compareTo(user.name);
            if (compare != 0){
                return compare;
            }else {
                return Integer.compare(this.age,user.age);
            }
        }else {
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}
