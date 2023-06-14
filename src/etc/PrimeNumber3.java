package etc;
import java.util.List;
import java.util.ArrayList;

public class PrimeNumber3 {

    public static void main(String[] args) {
        
        List<Integer> results = new ArrayList<>();

        for(int i = 1; i <= 100; i++){
            if(solution(i)) results.add(i);
        }

        for(Integer num : results){
            System.out.print(num + " ");
        }


        
    }

    static boolean solution(int num){
        //1 이하는 소수가 아님.
        if(num <= 1) return false;
        
        //2는 소수
        if(num == 2) return true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }

        return true;        

    }


    
}
