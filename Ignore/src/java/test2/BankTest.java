package src.java.test2;

public class BankTest {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addCustomers("Jane","Smith");

        bank.getCustomers(0).setAccount(new Account(2000));
        bank.getCustomers(0).getAccount().withdraw(500);
        double balance = bank.getCustomers(0).getAccount().getBalance();
        System.out.println("客户："+ bank.getCustomers(0).getFirstname()+bank.getCustomers(0).getLastname()+ "的账户余额是：" + bank.getCustomers(0).getAccount().getBalance());


    }

}
