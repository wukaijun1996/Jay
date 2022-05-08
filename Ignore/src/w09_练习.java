import java.util.Scanner;

public class w09_练习 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int number = scan.nextInt();

        int[] scores = new int[number];
        int[] scores1 = {1,3,4};
        System.out.println("请输入" + number + "个学生成绩");
        int maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }

        System.out.println(scores);

        char level;
        for (int i = 0; i < scores.length; i++) {
            if (maxScore - scores[i] <= 10){
                level = 'A';
            }else if (maxScore -scores[i] <= 20){
                level = 'B';
            }else if (maxScore - scores[i] <= 30){
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("Student " + i + " score is " + scores[i] + " ,grade is " + level);

        }









    }
}
