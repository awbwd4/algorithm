package etc;

public class Fibonacci3 {

    public static void main(String[] args) {

        solution(3);
        
    }


    static int solution(int number){

        if (number==1||number==2){
            return 1;
        }

        return solution(number-1) + solution(number-2);
    }

}
