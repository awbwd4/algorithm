package etc;

public class ReverseString3 {

    public static void main(String[] args) {
        
        String reversed = solution("abcde");
        System.out.println(reversed);

    }

    static String solution(String target){

        String reversed = "";

        for (int i = target.length()-1; i >= 0; i--) {
            reversed += target.charAt(i);
        }

        return reversed;
    }


    
}
