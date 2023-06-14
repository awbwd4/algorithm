package etc;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    
    public static void main(String[] args) {
        
        int n = 100000;
        // System.out.println(isPrimeNumber(17));

        List<Integer> primeNumbers = new ArrayList<>();

        // n 이하의 모든 자연수에 대해 소수를 구하라.
        for(int i = 1;i <= 100;i++){
            if(isPrimeNumber(i)){
                primeNumbers.add(i);
            }
        }

        for(Integer num : primeNumbers){
            System.out.print(num + " ");
        }

    }

    static boolean isPrimeNumber(int num){
        
        //1 이하는 소수가 아님.
        if(num <= 1) return false;
        
        //2는 소수
        if(num == 2) return true;


        for(int i = num-1;i > 1;i--){

            if(num%i == 0) return false;
        }

        return true;

    }


}
