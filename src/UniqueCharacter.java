
//1.1 Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?

public class UniqueCharacter {
    public static boolean isUniqueChar(String str) {
        for (int i = 0; i < str.length(); i++){
            for (int j = i +1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUniqueChar("wheelsup"));
        System.out.println(isUniqueChar("preposterous"));
        System.out.println(isUniqueChar("wheru"));
    }
}