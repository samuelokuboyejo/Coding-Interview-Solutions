package chapter1;
//1.3 Design an algorithm and write code to remove the duplicate characters in a string
//without using any additional buffer. NOTE: One or two additional variables are fine.
//An extra copy of the array is not.

public class RemoveDuplicate {

    public static String removeDuplicates(String str){
        if (str==null || str.isEmpty()) {
           return "Enter a valid string";
        }
        String result = "";

        for (int i = 0; i < str.length(); i++){
            boolean isDuplicate = false;
            char currentLetter = str.charAt(i);

            for (int j = 0; j < result.length(); j++){
                if (currentLetter == result.charAt(j)){
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result += currentLetter;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("banana"));
        System.out.println(removeDuplicates("aaahhab"));

    }
}
