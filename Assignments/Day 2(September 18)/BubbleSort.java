import java.util.Arrays;

public class BubbleSort {

    static int[] bubbleSort(int[] arry) {
        int n = arry.length;
        for (int pass = 1; pass <= n - 1; pass++) {
            boolean swapped = false;
            for (int i = 0; i <= n - 1 - pass; i++) {
                if (arry[i] > arry[i + 1]) {
                    int temp = arry[i];
                    arry[i] = arry[i + 1];
                    arry[i + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("pass " + pass + " " + Arrays.toString(arry));
            if (!swapped) break;   // already sorted
        }
        return arry;
    }

    public static void main(String[] args) {
        int[] arr = {42, 17, 35, 8, 36};
        bubbleSort(arr);
    }
}