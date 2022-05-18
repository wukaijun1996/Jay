package src.java.p12_抽象性的练习;

public abstract class Employee {
    int xx = 3;

    private  String name;
    private int id;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();
}
