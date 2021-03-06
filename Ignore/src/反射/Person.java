package src.反射;

public class Person {

    private String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "src.反射.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public  void show(){
        System.out.println("你好，我是一个人");
    }

    private String showNation(String nation){

        System.out.println("我的国籍是" + nation);
        return nation;
    }

}
