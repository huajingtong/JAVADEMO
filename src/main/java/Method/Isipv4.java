package Method;

/**
 * Created by hjt on 2020/3/10.
 */
public class Isipv4 {
    public static void main(String[] args) {
        System.out.println(Isipv4("1a1.123.12321.2"));
    }

    public static boolean Isipv4(String ipv4) {
        if (ipv4.length() == 0 || ipv4 == null) {
            return false;
        }
        String[] parts = ipv4.split("\\.");
        if (parts.length != 4) {
            return false;
        }
        for (int i = 0; i < parts.length; i++) {
            try {
                int n = Integer.parseInt(parts[i]);
                if(n>255||n<0){
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }


//        for(int i=0;i<parts.length;i++){
//            try{
//                int n=Integer.parseInt(parts[i]);
//                if(n<0 || n>255){
//                    return false;//数字不在正确范围内
//                }
//            }catch (NumberFormatException e) {
//                return false;//转换数字不正确
//            }
//        }
        return true;
    }
}
