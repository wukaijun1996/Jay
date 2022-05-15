package src.java.p4_继承和super;

public class Account {

    private int id; //账号
    private double balance;  //余额
    private double annualIntetestRate; //利率

//    public Account() {
//    }

    public Account(int id, double balance, double annualIntetestRate) {
        super();
        this.id = id;
        this.balance = balance;
        this.annualIntetestRate = annualIntetestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualIntetestRate() {
        return annualIntetestRate;
    }

    public void setAnnualIntetestRate(double annualIntetestRate) {
        this.annualIntetestRate = annualIntetestRate;
    }

    //返回月利率
    public double getMonthlyInterest() {
        return annualIntetestRate / 12;
    }

    //取钱
    public void withDraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return;
        }
        System.out.println("余额不足");

    }

    //存钱
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        }
    }
}






