package src;

public class w07_嵌套循环 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1;j <= i; j++){

                System.out.print(i + "x" +j + "=" + i * j + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0;j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("分割线");
        for (int i = 0; i < 5; i++) {
            for (int j = 1;j <= 5 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
