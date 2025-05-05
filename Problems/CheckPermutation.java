import java.util.Arrays;

/**
 * CheckPermutation
 */
public class CheckPermutation {

  public static boolean permutation(String a,String b){

    if(a.length() != b.length()) return false;
    a = a.toLowerCase();
 b =    b.toLowerCase();
    int[] track = new int[128];
    Arrays.fill(track, 0);

    for(int ch : a.toCharArray()){
      track[ch-'a']++;
    }

    for(int ch : b.toCharArray()){
      track[ch-'a']--;
    }
    
    for(int i : track){
      if(i!= 0) return false;
    }

    return true;

  }
  public static void main(String[] args) {
    System.out.println(permutation("dog", "God"));
    
  }
}
