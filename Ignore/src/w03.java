import java.util.Scanner;

public class w03 {
    public static void main(String[] args) {
        for (int i = 0; i < 150; i++) {
            System.out.print(i + " ");
            if (i % 3 == 0) {
                System.out.print("foo ");
            }
            if (i % 5 == 0) {
                System.out.print("biz ");
            }
            if (i % 7 == 0) {
                System.out.print("baz ");
            }
            System.out.println();

        }
        Scanner scan = new Scanner(System.in);
        String info = scan.next();
        int id = scan.nextInt();
        System.out.println(info);
        System.out.println(id );

    }
}
