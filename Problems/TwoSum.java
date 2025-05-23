import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * TwoSum
 */
public class TwoSum {

    public static int[] findTwoSum(int[] num, int target) {
        // int[] ans = new int[2];
        // brute force approach

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        //
        // if (num[i] + num[j] == target) {
        // ans[0] = i;
        // ans[1] = j;
        // return ans;
        // }
        // }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            hashMap.put(num[i], i);
        }
        for (int i = 0; i < num.length; i++) {
            if (hashMap.containsKey(target - num[i]) && hashMap.get(target - num[i]) != i)
                return new int[] { i, hashMap.get(target - num[i]) };
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter The array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target");
        int target = sc.nextInt();
        sc.close();

        System.out.println(Arrays.toString(findTwoSum(arr, target)));
    }
}
