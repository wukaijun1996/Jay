package src.Thread_test;

class MThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}


public class ThreadTest1 {

    public static void main(String[] args) {

        //创建实现类的对象
      MThread mThread = new MThread();

      Thread t1 = new Thread(mThread);
      t1.start();


        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + i);
            }
        }

    }

}
