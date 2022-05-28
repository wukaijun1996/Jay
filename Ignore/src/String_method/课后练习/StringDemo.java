package src.String_method.课后练习;


/**
 * 自定义将字符指定位置翻转方法
 *
 */
public class StringDemo {

    //方式1：
    public static String reverse(String str, int startIndex, int endIndex) {

        if (str != null) {
            char[] chars = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y; x++, y--) {
                char temp = chars[x];
                chars[x] = chars[y];
                chars[y] = temp;
            }
            return new String(chars);
        }
        return null;
    }

    // 方式2:将其分为三个部分
    public static String reverse1(String str, int startIndex, int endIndex) {


        if (str != null) {
            String reverseStr = str.substring(0, startIndex);
            for (int i = endIndex; i >= startIndex; i--) {
                reverseStr += str.charAt(i);
            }
            reverseStr += str.substring(endIndex + 1);
            return reverseStr;
        }
        return null;
    }

    //方式3 ： 使用StringBuffer/StringBuilder替换String
    public static String reverse2(String str, int startIndex, int endIndex) {


        if (str != null) {
            StringBuilder builder = new StringBuilder(str.length());

            builder.append(str.substring(0, startIndex));
            for (int i = endIndex; i >= startIndex; i--) {

                builder.append(str.charAt(i));
            }
            builder.append(str.substring(endIndex + 1));
            return builder.toString();
        }
        return null;
    }


    public static void main(String[] args) {

        String a = "abcdefg";
        System.out.println(reverse2(a, 2, 5));

    }

}
