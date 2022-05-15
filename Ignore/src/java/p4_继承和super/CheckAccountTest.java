package src.java.p4_继承和super;

public class CheckAccountTest {
    public static void main(String[] args) {

        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);

        checkAccount.withDraw(5000);
        System.out.println("您的账户余额为： " + checkAccount.getBalance());
        System.out.println("您的可透支额度为： " + checkAccount.getOverdraft());
        checkAccount.withDraw(18000);
        System.out.println("您的账户余额为： " + checkAccount.getBalance());
        System.out.println("您的可透支额度为： " + checkAccount.getOverdraft());
        checkAccount.withDraw(3000);
        System.out.println("您的账户余额为： " + checkAccount.getBalance());
        System.out.println("您的可透支额度为： " + checkAccount.getOverdraft());

    }
}
