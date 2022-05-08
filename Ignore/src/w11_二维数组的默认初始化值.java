public class w11_二维数组的默认初始化值 {

    public static void main(String[] args) {
        int[][] arr =new int[4][3];
        System.out.println(arr[2][0]);
        System.out.println(arr[0]);
        System.out.println(arr);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
        int[] arr1 =new int[5];
        System.out.println(arr1);
        System.out.println(arr1[0]);

        String[] arr3 =new String[5];
        System.out.println(arr3);
        System.out.println(arr3[0]);

        int[][] arr2 =new int[3][];
        System.out.println(arr2);
        System.out.println(arr2[0]);
    }

}
