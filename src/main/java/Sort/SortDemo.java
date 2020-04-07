package Sort;

/**
 * Created by hjt on 2020/3/11.
 */
public class SortDemo {
    public static void main(String[] args) {
        int[] arr = {10, 22, 3, 4, 5, 1, 6};
        print(QuickSort(arr, 0, arr.length - 1));
    }

    public static int[] QuickSort(int arr[], int left, int right) {
        if (left >= right) {
            return null;
        }
        int key = arr[left];
        int i = left;
        int j = right;

        for (; i < j; ) {
            for (; key < arr[j] && i < j; j--) ;
            for (; key >= arr[i] && i < j; i++) ;
            if (i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        arr[left]=arr[i];
        arr[i]=key;

        QuickSort(arr,left,i-1);
        QuickSort(arr,i+1,right);

        return arr;
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


}
