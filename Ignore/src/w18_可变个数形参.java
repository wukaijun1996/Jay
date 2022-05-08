public class w18_可变个数形参 {

    public static void main(String[] args) {

        w18_可变个数形参 test = new w18_可变个数形参();
        test.show(11);
        test.show("ds","sdssss");
        test.show("dfdw");
        test.show();

    }

    public void show(int m){
        System.out.println("666");
    }

    public void show(String ... str){
        System.out.println("show(String ... str)");
    }

    public void show(int n,String ... str){
        System.out.println("show(String ... str)");
    }



}
