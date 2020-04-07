package Method;

import java.util.Scanner;

/**
 * 输入一个数组，1, 5, 6, 2, 3, 4, 5, 6, 1, 2
 * 1,5,6有序长度为3,  2,3,4,5,6有序长度为5， 1,2有序长度为2
 * 输出他们最常的有序长度为5
 * Created by hjt on 2020/3/14.
 */
public class LongestSortedLengthDemo1 {
    public static void main(String[] args) {
        System.out.println("请输入几个数并用逗号隔开：");
        Scanner in=new Scanner(System.in);
        String str = in.next();
        String[] arr  = str.split(",");
        int[] b = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            //将字符串参数作为有符号的十进制整数进行解
            b[i] = Integer.parseInt(arr[i].trim());
            System.out.print(b[i] + " ");
        }
//        int[] b = {};
//        int[] b = {1};
//        int[] b = {1, 2};
//        int[] b = {2,1};
//        int[] b = {2,1,2,3,123,1,2};
//        int[] b = {1, 5, 6, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 8};
//        int[] b = {1, 5, 6, 2, 3, 4, 5, 6, 1, 2};
        System.out.println("长度为：" + Method(b));
    }

    public static int lengthDemo(int[] b, int x, int length) {
        int j = 0;
        for (int i = x; i < length - 1; i++) {
            j = i;
            if (b[i] < b[i + 1]) {
                j++;
                continue;
            } else {
//                System.out.println(j);
                break;
            }
        }
        return j + 1;
    }

    public static int Method(int[] b) {
        int s = 0;
        int x = 0;
        int length1 = 0;
        int length2 = 0;
        if (b.length == 0) {
            System.out.println("你输入的数组为空");
        } else if (b.length == 1) {
            length1 = 1;
        } else {
            while (x + 1 < b.length) {
                x = lengthDemo(b, x, b.length);//2,7,9
                length2 = x - s;//2+1-0-1
                if (length2 > length1) {
                    int temp = length2;
                    length2 = length1;
                    length1 = temp;
//                System.out.println("长度为：" + length1);
                }
                s = x;
            }

        }
        return length1;
    }
}