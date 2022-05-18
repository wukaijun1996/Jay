package src.java.p12_抽象性的练习;

public class Manager extends Employee{

    int xx = 4;
    private double bonus;//奖金

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理员工，提供公司运行的效率");
        System.out.println();
    }
}
