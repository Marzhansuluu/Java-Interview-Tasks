package string_tasks;

public class String_UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }



//   4. String -- Find the unique
//Write a return  method that can find the unique characters from the String
//
//Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

    public static String unique(String str) {
        String[] arr = str.split("");
        String result = "";

        for (int j = 0; j < arr.length; j++) {
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    num++;
                }
            }
            if (num == 1) {
                result += arr[j];
            }
        }

        return result;
    }


}
