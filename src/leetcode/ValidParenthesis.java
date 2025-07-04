package leetcode;

import java.util.Map;
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        Map<Character, Character> map= Map.of(
                ')', '(', '}', '{', ']', '['
        );

        for (char c : s.toCharArray()){
            if (map.containsKey(c)){
                if(stack.isEmpty() || stack.pop() != map.get(c)){
                    return false;
                }

            }else{
                stack.push(c);
            }
        }


        return stack.isEmpty();
    }
}
