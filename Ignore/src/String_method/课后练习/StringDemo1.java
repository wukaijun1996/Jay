package src.String_method.课后练习;


/**
 * 获取一个字符串在另一个字符串出现的次数
 */
public class StringDemo1 {

    /**
     * subStr 在 mainStr 中出现的次数
     *
     * @param mainStr
     * @param subStr
     * @return
     */
    public static int getCount(String mainStr, String subStr) {

        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;
        if (mainLength >= subLength) {

            //方式1
//            while ((index = mainStr.indexOf(subStr)) != -1) {
//                count++;
//                mainStr = mainStr.substring(index + subLength);
            //方式2
            while ((index = mainStr.indexOf(subStr,index)) != -1){
                count++;
                index += subLength;

            }
            return count;


        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        String mainstr = "abkkcadkabkebfkaabkskab";
        String substr = "ab";

         int count = getCount(mainstr, substr);
        System.out.println(count);

    }


}
