import java.util.Scanner;

public class w06_while {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int count_1 = 0;
        int count_2 = 0;

//        两种格式  for(;;)
        while (true){

            int num = scan.nextInt();
            if (num > 0) {
                count_1++;
            }
            if (num < 0) {
                count_2++;
            }
            if (num == 0) {
                break;
            }
        }

        System.out.println("正数个数为" + count_1);
        System.out.println("负数个数为" + count_2);


    }

}
