package chapter1;

//1.5 Write a method to replace all spaces in a string with ‘%20’.
public class ReplaceSpace {

    public static String replaceString(String str){

        StringBuilder result = new StringBuilder();
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == ' '){
                result.append("%20");
            }else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceString("hello world"));
        System.out.println(replaceString("thank you very much"));
    }
}
