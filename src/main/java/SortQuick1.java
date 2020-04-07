/**
 * Created by hjt on 2020/3/6.
 */
public class SortQuick1 {
    public static void main(String[] args) {
        int[] a = {6, 1, 2, 7, 9, 3, 7, 5, 10, 8};
//        sop(a);
        sop(Qucick1(a, 0, a.length - 1));
    }

    public static int[] Qucick1(int[] a, int left, int right) {
        if (left >= right) {
            return null;
        }
        int key = a[left];
        int i = left;
        int j = right;
        for (; i < j; ) {
            for (; key < a[j] && i < j; j--);
            for (; key >= a[i] && i < j; i++);
                if (i < j) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                    }
        }
        //交换基准值到中间点
        a[left]=a[i];
        a[i]=key;

        Qucick1(a,left,i-1);
        Qucick1(a,i+1,right);
        return a;
    }

    public static int[] sop(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        return a;
    }
}
