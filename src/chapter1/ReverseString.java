package chapter1;//1.2 Write code to reverse a C-Style String. (C-String means that “abcd” is represented as five characters, including the null character.)

public class ReverseString {
    public static String reverseString(String str){
        if (str.isEmpty()) System.out.println("Enter a valid string");
        String reversedStr = "";

        for (int i = 0; i < str.length(); i++) {
            reversedStr = str.charAt(i) + reversedStr ;
        }
        return reversedStr + "\0";
    }



    public static void main(String[] args) {
        System.out.println(reverseString("abcd"));
        System.out.println(reverseString("water"));

    }
}
