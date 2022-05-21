public class w10_二维数组 {
    public static void main(String[] args) {

        int[][] arr2 = new  int[][]{{1,2,3},{32,2,6},{3,34},{7,8,9,10}};
        int[][] arr3 = {{32,2},{2,4,5}};
        String[][] arr4 = new String[3][];
        int[] arr5[] = {{32,65,34},{4,7,8}};

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
