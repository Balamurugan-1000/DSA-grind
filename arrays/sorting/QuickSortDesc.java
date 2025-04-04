import java.util.Arrays;

public class QuickSortDesc {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int idx = low, temp;
        for (int i = low; i < high; i++) {
            if (arr[i] >= pivot) {
                temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
        temp = arr[idx];
        arr[idx] = arr[high];
        arr[high] = temp;

        return idx;
    }

    public static void qs(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int pivot = partition(arr, low, high);
        System.out.println(pivot);

        qs(arr, low, pivot - 1);
        qs(arr, pivot + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = { 23, 45, 2, 4, 36, 5 };

        qs(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
