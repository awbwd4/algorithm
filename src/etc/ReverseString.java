package etc;

public class ReverseString {
    
    public static void main(String[] args) {
        
        String  str = "ABCDE";

        String reversed = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println(reversed);

    }



}
