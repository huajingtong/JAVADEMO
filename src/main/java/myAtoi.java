/**
 * Created by hjt on 2020/3/7.
 */
public class myAtoi {
    public static void main(String[] args) {
        myAtoi i= new myAtoi();
//        System.out.println(i.myAtoi1("   "));
//        System.out.println(i.myAtoi1(""));
//        System.out.println(i.myAtoi1(" 1 2 3"));
//        System.out.println(i.myAtoi1("+1 2 3"));
//        System.out.println(i.myAtoi1("  1234 "));
        System.out.println(i.myAtoi1("2147483648"));
//        System.out.println(i.myAtoi1("-0034"));
//        System.out.println(i.myAtoi1("-34"));
//        System.out.println(i.myAtoi1("+"));
//        System.out.println(i.myAtoi1("-"));
//        System.out.println(i.myAtoi1("+0"));
//        System.out.println(i.myAtoi1("-0"));
//        System.out.println(i.myAtoi1("+ABC"));
//        System.out.println(i.myAtoi1("+1p"));
    }
    public int myAtoi1(String str) {
        str = str.trim();  // 删除字符串头尾空格
        if (str.length() == 0) return 0;
        int flag = 1;  // 符号位标识
        int rev = 0;  // 数值（无符号）
        int edge = Integer.MAX_VALUE / 10;  // 判断数值是否超过范围的边界线，这样写可以节省时间
        if (str.charAt(0) == '-') {
            flag = -1;
            str = str.substring(1, str.length());  // 跳过符号位，可不写第二参数
        } else if (str.charAt(0) == '+') {
            str = str.substring(1, str.length());  // 跳过符号位，可不写第二参数
        } else if (!(str.charAt(0) >= '0' && str.charAt(0) <= '9')) {  // 如果开始非空字符不为符号或数字，则直接返回 0
            return 0;
        }
        for (char s : str.toCharArray()) {
            if (s >= '0' && s <= '9') {
                int n = s - '0';  // 计算字符代表值
                if (rev >= edge) {  // 超过边界情况较少，故该判断写于外侧
                    if (flag == 1) {
                        if (rev > edge || n > 7) return Integer.MAX_VALUE;
                    } else {
                        if (rev > edge || n > 8) return Integer.MIN_VALUE;
                    }
                }
                rev = rev * 10 + n;
            } else {
                break;
            }
        }
        return rev * flag;
    }
}
