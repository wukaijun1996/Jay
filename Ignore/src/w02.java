public class w02 {

    public static void main(String[] args) {

        int m = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello,World");
            m++;
        }
        //i在循环内有效
        System.out.println(m);

        int num = 1;
        for (System.out.println('a'); num <= 3; System.out.println('c'), num++) {
            System.out.println("b");
        }

        int sum = 0;
        int count = 0;
        int sum1 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 0){
                System.out.println(i);
                sum += i;
                count++;
            }
            if (i % 2 != 0) {
                System.out.println(i);
                sum1 += i;
                count1++;
            }
            count2 += i;
        }
        System.out.println("总和为" + sum);
        System.out.println("偶数总个数为" + count);
        System.out.println("奇数总和为" + sum1);
        System.out.println("奇数总个数为" + count1);
        System.out.println("奇数偶数总和为" + count2);



        System.out.print("非常洒青春是的");
        System.out.print("顾问费 ");
    }
}
