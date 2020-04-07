package Method;
import java.util.Scanner;
/**
 * Created by hjt on 2020/3/11.
 */
public class CommonMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
        int a=18;
        int b=12;
            int max = gcdfun(a, b);//最大公约数
            int min = gcdluc(a, b);//最小公倍数
        System.out.println(max+min);
//            System.out.println("最大公因数是：" + max + "," + "最小公倍数数是：" + min);
        }
//}
//最大公约数
        public static int gcdfun ( int a, int b){
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (a % b != 0) {
                return gcdfun(b, a % b);
            }
            return b;
        }

//最小公倍数
        public static int gcdluc ( int a, int b){
            int gcd = gcdfun(a, b);
            int result = (a * b) / gcd;
            return result;
        }
    }
