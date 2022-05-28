package src.String_method.课后练习;

/**
 * 获取两个字符串中最大相同子串
 */
public class StringDemo2 {

    public static String getMaxSameString(String str1, String str2) {


        if (str1 != null && str2 != null) {
            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;

            int length = minStr.length();
            for (int i = 0; i < length; i++) { //从短的入手 ，将短字符串从长度length对比，依次

                for (int x = 0, y = length - i; y <= length; x++, y++) {
                    String subStr = minStr.substring(x, y);
                    if (maxStr.contains(subStr)) {
                        return subStr;
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        String str1 = "qdsxcasalollahellobnmdfdwdwdcvsd";
        String str2 = "lacvhelloaaabnm";
         String maxSameString = getMaxSameString(str1, str2);
        System.out.println(maxSameString);

    }

}
