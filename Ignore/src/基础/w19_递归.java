public class w19_递归 {

    public static void main(String[] args) {

        w19_递归 test = new w19_递归();
        int a = test.getSum(100);
        System.out.println(a);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(test.f(10));
    }

    //1-100累加的和
    public int getSum(int n){
        if (n == 1){
            return 1;
        }else {
            return n + getSum(n-1);
        }
    }


    public int f(int n){
        if (n == 0){
            return 1;
        }else if(n == 1){
            return 4;
        }else {
            return 2*f(n-1) + f(n-2);
        }
    }

    //斐波那契数列



}
