public class MaxSubArrSum {

  public static int[] find(int[] arr) {
    int[] ans = new int[arr.length];
    int max = Integer.MIN_VALUE, left = 0, right = 0, sum = 0, msInd = 0, mxInd = 0;

    for (int i = 0; i < arr.length; i++) {

      // kadane algo
      sum += arr[right];

      if (max < sum) {
        max = sum;
        msInd = left;
        mxInd = right;
      }
      if (sum < 0) {
        sum = 0;
        left = i + 1;
      }
      right++;

    }

    System.out.println(msInd);
    System.out.println(mxInd);
    return ans;

  }

  public static void main(String[] args) {
    int[] array = { 1, 2, -4, -1, 7, 7, 7, 7, 7, 5 };

    find(array);
  }
}
