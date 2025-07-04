package leetcode;

//Given an integer x, return true if x is a palindrome, and false otherwise.

public class Palindrome {

    public boolean isPalindrome(int x) {

        String str = Integer.toString(x);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);

    }
}
