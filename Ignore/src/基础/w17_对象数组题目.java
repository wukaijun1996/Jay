public class w17_对象数组题目 {
    public static void main(String[] args) {

        Student[] stud = new Student[20];

        for (int i = 0; i < stud.length; i++) {
            stud[i] = new Student();
            stud[i].number = i + 1;
            //年级若是1-9年级
            stud[i].state =(int) (Math.random() * 9  + 1);
            //成绩[0,100]
            stud[i].score = (int) (Math.random() * 101  + 0);
        }

        w17_对象数组题目 test = new w17_对象数组题目();
        test.print(stud);
        System.out.println("#########################");
        test.searchState(stud,3);
        System.out.println("#########################");
        test.sort(stud);
        test.print(stud);


    }

    //遍历数组的方法
    public void print(Student[] stud) {
        for (int i = 0; i < stud.length; i++) {
                System.out.println(stud[i].info());
        }
    }
    public void searchState(Student[] stud,int state){
        for (int i = 0; i < stud.length; i++) {
            if (stud[i].state == state){
                System.out.println(stud[i].info());
            }
        }
    }
    public void sort(Student[] stud){
        //冒泡排序对其排序
        for (int i = 0; i < stud.length -1; i++) {
            for (int j = 0; j < stud.length - 1 - i; j++) {
                if (stud[j].score > stud[j+1].score){
                    Student temp = stud[j];
                    stud[j] = stud[j+1];
                    stud[j+1] = temp;
                }
            }
        }
    }

}

class Student{

    int number;//学号
    int state;//年级
    int score;//成绩
    public String info(){
        return "学号：" + number + "，年级" + state + "，成绩" + score;
    }

}
