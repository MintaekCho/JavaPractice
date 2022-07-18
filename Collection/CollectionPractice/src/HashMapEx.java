
import java.util.*;
public class HashMapEx {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.countAllCharacter("banana");
    }


}

class Solution {
    public HashMap<Character, Integer> countAllCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i<str.length(); i++){
            Character ch = str.charAt(i);
            if (map.containsKey(ch)){
                int j = map.get(ch);
                j++;
            }
            else map.put(ch, 1);
        }
        return map;
    }
}