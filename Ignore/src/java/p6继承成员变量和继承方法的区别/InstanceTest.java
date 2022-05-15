package src.java.p6继承成员变量和继承方法的区别;

public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest instanceTest = new InstanceTest();
        instanceTest.method(new Person());
    }


    public void method(Person e) {

        if (e instanceof Student) {
            String info = e.getInfo();
            System.out.println(info);
        }
        if (e instanceof Graduate) {
            String info = e.getInfo();
            System.out.println(info);
        }
        if (e instanceof Person) {
            String info = e.getInfo();
            System.out.println(info);
        }
    }

}

class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name:" + name + "\n" + "age:" + age;
    }
}

class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "Name:" + name + "\n" + "age:" + age + "\nschool" + school;
    }
}

class Graduate extends Student {
    public String major = "IT";

    public String getInfo() {
        return "Name:" + name + "\n" + "age:" + age + "\nschool" + school + "\nmajor" + major;
    }
}
