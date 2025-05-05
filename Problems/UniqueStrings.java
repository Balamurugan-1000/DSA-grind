import java.util.Arrays;

public class UniqueStrings {

  public static boolean find(String str){

    // int[] track = new int[26];
    boolean[] track = new boolean[str.length()];
     str = str.toLowerCase(); // 🔥 convert to lowercase
    // Arrays.fill(track, 0);
    //
    // for(int i : str.toCharArray()){
    //   track[i-'a']++;
    // }
    // for(int i : track){
    //   if(i>1) return false;
    // }

    Arrays.fill(track, false);


    for(char i : str.toCharArray()){
      if(i >= 'a' && i<= 'z'){

        if(track[i-'a']) return false;
        track[i-'a'] = true;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    
    System.out.println(find("Blamrugn"));
  }
}
