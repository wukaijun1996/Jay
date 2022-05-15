package src.java.p4_继承和super;

public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account(1122,20000.00,0.045);

//        account.withDraw(30000);
//        System.out.println("当前余额为： " + account.getBalance());
        account.withDraw(3000);
        System.out.println("当前余额为： " + account.getBalance());
        account.withDraw(2500);
        System.out.println("当前余额为： " + account.getBalance());

        System.out.println("月利率为： " + account.getMonthlyInterest() * 100 + "%");

    }
}
