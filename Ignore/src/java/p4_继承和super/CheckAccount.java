package src.java.p4_继承和super;

public class CheckAccount extends Account {

    private double overdraft;

    public CheckAccount(int id, double balance, double annualIntetestRate, double overdraft) {
        super(id, balance, annualIntetestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withDraw(double amount) {
        if (getBalance() >= amount) {
            //方式1
//            setBalance(getBalance() - amount);
            //方式2
            super.withDraw(amount);
        } else if (overdraft >= (amount - getBalance())) {

            overdraft -= (amount - getBalance());
//            setBalance(0);
            super.withDraw(getBalance());
        } else {
            System.out.println("超出可透支限额！ ");
        }
    }
}
