package chapter1;//1.4 Write a method to decide if two strings are anagrams or not.

import java.util.Arrays;

public class Anagrams {

    public static boolean areAnagrams(String str1, String str2){
    if (str1.length() != str2.length())
        return false;

    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();

    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("gun", "Nug"));
        System.out.println(areAnagrams("Feed", "efed"));
        System.out.println(areAnagrams("feast", "burn"));
    }
}
