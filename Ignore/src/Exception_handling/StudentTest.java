package src.Exception_handling;

import java.util.stream.StreamSupport;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student();
        try {
            student.regist(-1001);
        System.out.println(student);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }
}

class Student {
    private int id;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }

    public void regist(int id) throws Exception {
        if (id > 0) {
            this.id = id;
        } else {
//            System.out.println("输入的数据非法");
//            throw new RuntimeException("输入的数据非法哟");
            throw new Exception("输入的数据非法哟");
        }
    }
}