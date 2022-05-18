package src.java.p11_static账户信息;

public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account();
        Account account2 = new Account("qwertyy",2000);

        Account.setInterestRate(0.012);
        Account.setMinMoney(100);

        System.out.println(account1);
        System.out.println(account2);

        System.out.println(account1.getMinMoney());
        System.out.println(account1.getMinMoney());
        System.out.println(account1.getInterestRate());
        System.out.println(Account.getInterestRate());


    }

}
