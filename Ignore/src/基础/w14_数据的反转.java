import java.util.Arrays;

public class w14_数据的反转 {
    public static void main(String[] args) {


        String[] arr = new String[]{"JJ","QQ","KK","AA","CC","MM"};

        String[] arr1 = arr;
//        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr.length/2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length-i-1] = temp;
        }

        System.out.println(Arrays.toString(arr));


    }

}
