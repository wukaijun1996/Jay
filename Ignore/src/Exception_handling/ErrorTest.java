package src.Exception_handling;

public class ErrorTest {
    public static void main(String[] args) {
        //java.lang.StackOverflowError 栈溢出
        main(args);
        //java.lang.StackOverflowError 堆溢出
        Integer[] arr = new Integer[1024*1024*1024];

    }
}
