package src.java.test1;

import java.util.Arrays;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer("Jane","Smith");

        Account acc = new Account(1000,2000,0.0123);

        customer.setAccount(acc);

        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);


    }

}
