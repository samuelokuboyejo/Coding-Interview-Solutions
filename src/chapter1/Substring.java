package chapter1;

//1.8 Assume you have a method isSubstring which checks if one word is a substring of
//another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
//only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
public class Substring {

    public static boolean isSubstring(String s1, String s2){
        return s1.contains(s2);
    }

    public static boolean isRotation(String s1, String s2){
        if (s1.length() != s2.length())
            return false;
        String combined = s1 + s1 ;
    return isSubstring(combined, s2);
    }


    public static void main(String[] args) {
        System.out.println(isRotation("iron", "roni"));
        System.out.println(isRotation("erbottlewat","waterbottle"));
    }
}
