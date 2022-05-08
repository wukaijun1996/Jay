import java.util.Scanner;

public class w05_水仙花 {
    public static void main(String[] args) {

//        System.out.println("请输入一个三位数");
//        Scanner scan = new Scanner(System.in);

//        int num = scan.nextInt();

        for (int num = 100; num < 1000 ; num++) {

            int bai = num / 100;
            int shi = num % 100 /10;
            int ge = num % 10;

//            System.out.println(bai);
//            System.out.println(shi);
//            System.out.println(ge);

            if (bai * bai * bai + shi * shi * shi +ge * ge * ge == num){
                System.out.println(num);
            }
        }


    }
}
