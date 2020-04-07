package Util;

import com.sun.javafx.image.BytePixelSetter;

/**
 * Created by hjt on 2020/3/9.
 */
public class Util {
    public static boolean StringToInt(String str) {
        if (!(Util.Stringisnull(str))) {
//            Integer.parseInt(X);
            char[] arr = str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= '0' && arr[i] <= '9') {
//                    System.out.println("继续");
                } else {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }


    public static boolean Stringisnull(String str) {
        if (str==null){
            return false;
        }
        else {
            return ("".equals(str.trim()));
        }
    }

    public static int StringCompare(String str1, String str2) {
        boolean x = Util.StringToInt(str1);
        boolean y = Util.StringToInt(str2);
        int flag = 0;
        if (x && y) {
            if (Integer.parseInt(str1) > Integer.parseInt(str2)) {
                flag = 1;
            } else if (Integer.parseInt(str1) == Integer.parseInt(str2)) {
                flag = 0;
            }
        } else {
            flag = -1;
        }
        return flag;
    }

    public static void main(String[] args) {
        String s1 = "";
        String s2 = "1234";
        String s3 = "1234";
        String s4 = "123";
        String s5 = "abc";

        System.out.println(Util.Stringisnull(null));
//        System.out.println(Util.Stringisnull(s1));
//        System.out.println(Util.Stringisnotnull(s2));
//        System.out.println(Util.StringToInt(s1));
//        System.out.println(Util.StringToInt(s2));
//        System.out.println(Util.StringToInt(s5));
//        System.out.println(Util.StringCompare(s2,s3));
//        System.out.println(Util.StringCompare(s2,s4));

    }
}
