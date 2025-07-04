package leetcode;

import java.util.HashMap;

public class UniqueChar {
    public static int uniqueChar(String s){
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if (charCount.containsKey(c)){
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if (charCount.get(c) == 1) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(uniqueChar("leetcode"));
        System.out.println(uniqueChar("loveleetcode"));
        System.out.println(uniqueChar("aabb"));
        System.out.println(uniqueChar("aaaabeerrdd"));
    }
}
