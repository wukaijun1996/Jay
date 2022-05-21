public class w16_打印矩形 {


    public static void main(String[] args) {

        w16_打印矩形 meth = new w16_打印矩形();
        meth.method();
        System.out.println();

        System.out.println("---------------------------");
        System.out.println("面积为" + meth.method1());
        System.out.println("---------------------------");
        System.out.println("面积为" + meth.method2(20,10));
    }

    public void method(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*"+ "\t");
            }
            if (i != 9) {
                System.out.println();
            }
        }

    }

    public int method1(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*"+ "\t");
            }
            System.out.println();
        }
        return 10 * 8;
    }

    public int method2(int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*"+ "\t");
            }
            System.out.println();
        }

        return m * n;
    }


}
