import java.util.HashSet;
import java.util.Scanner;

/**
 * containDuplicate
 */
public class containDuplicate {

    public static boolean hasDuplicate(int[] arr) {

        // Brute force
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i; j < arr.length; j++) {
        // if (arr[i] == arr[j])
        // return true;
        // }
        // }
        // Optimized

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashSet.contains(arr[i])) {
                return true;
            }
            hashSet.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // If want take variable n and get input I take 10 for simplicity
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(hasDuplicate(array));

    }
}
