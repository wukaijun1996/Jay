package src.java.p13_抽象性的课后练习;

public class HourltEmployee extends Employee {
    private int wage;//每小时的工资
    private int hour;//月工作的小时数

    public HourltEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public HourltEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourltEmployee{" +
               super.toString() +
                '}';
    }
}
