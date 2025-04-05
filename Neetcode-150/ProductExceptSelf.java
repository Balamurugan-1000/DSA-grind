import java.util.Arrays;
import java.util.Scanner;

/**
 * ProductExceptSelf
 */
public class ProductExceptSelf {

    public static void findProduct(int[] arr) {

        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = product;
            else
                arr[i] = product / arr[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        findProduct(arr);
        System.out.println(Arrays.toString(arr));

    }
}
