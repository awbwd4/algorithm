package etc;

public class ReverseString2 {
    
    public static void main(String[] args) {
        
        String str = "abcde";
        String reversed = "";


        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println(reversed);




    }


}
