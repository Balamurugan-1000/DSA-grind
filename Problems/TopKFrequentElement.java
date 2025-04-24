import java.util.*;

public class TopKFrequentElement {

  public static int[] topFreq(int[] nums, int k) {
    HashMap<Integer, Integer> freqMap = new HashMap<>();

    for (int num : nums) {
      freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> freqMap.get(a) - freqMap.get(b));

    for (int key : freqMap.keySet()) {
      queue.offer(key);
      if (queue.size() > k) {
        queue.poll();
      }
    }

    int[] ans = new int[k];
    for (int i = k - 1; i >= 0; i--) {
      ans[i] = queue.poll();
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 3, 3, 4, 5, 6, 7, 7 };
    int k = 2;

    System.out.println(Arrays.toString(topFreq(arr, k)));
  }
}
