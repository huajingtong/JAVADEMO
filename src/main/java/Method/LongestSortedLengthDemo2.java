package Method;

import java.util.Arrays;
import java.util.Scanner;

/**
 * sky
 * 输入一个数组，1, 5, 6, 2, 3, 4, 5, 6, 1, 2
 * 1,5,6有序长度为3,  2,3,4,5,6有序长度为5， 1,2有序长度为2
 * 输出他们最常的有序长度为5
 * Created by hjt on 2020/3/14.
 */
public class LongestSortedLengthDemo2 {
    public static void main(String[] args) {
//        int[] b = {};
//        int[] b = {1};
//        int[] b = {1, 2};
//        int[] b = {2,1};
        int[] b = {2,1,2,3,123,1,2};
        //int[] b = {1, 5, 6, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 8};
        //int[] b = {1, 5, 6, 2, 3, 4, 5, 6, 1, 2};
        int longestOrderedStringLength = longestOrderedStringLength(b);
        System.out.println("数组" + Arrays.toString(b) + "最长有序长度:" + longestOrderedStringLength);
    }

    public static int longestOrderedStringLength(int[] data) {
        if (data == null || data.length == 0) {
            return 0;
        }
        if (data.length == 1) {
            return 1;
        }
        int dataLen = data.length;
        int lastInt = data[0];
        int maxOrderedLength = 1;
        int lastOrderedLength = 1;
        for (int i = 1; i < dataLen; i++) {
            int nowInt = data[i];
            if (nowInt >= lastInt) {
                lastInt = nowInt;
                lastOrderedLength++;
                if (lastOrderedLength > maxOrderedLength) {
                    maxOrderedLength = lastOrderedLength;
                }
            }else {
                lastInt = nowInt;
                if (lastOrderedLength > maxOrderedLength) {
                    maxOrderedLength = lastOrderedLength;
                }
                lastOrderedLength = 1;
            }
        }
        return maxOrderedLength;
    }
}
