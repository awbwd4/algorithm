package etc;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber2 {

    public static void main(String[] args) {
    
        List<Integer> result = new ArrayList<>();

        //n 이하의 모든 자연수에 대해 소수 구하기
        for (int i = 1; i <= 1000; i++) {
            if(solution(i)) result.add(i);
        }

        for(Integer num:result){
            System.out.print(num + " ");
        }

    }


    static boolean  solution(int num){ // 해당 숫자가 소수인지 판별

        if (num <= 1) return false;
        if (num == 2) return true;

        for(int i = num-1 ; i>1 ; i--){ 
            // 해당숫자보다 1 작은 수부터 2까지 쭈욱 내려가면서 나머지가 0이 되는 경우가 있다면 소수가 아니다.
            if(num%i == 0 ) return false;
        }

        return true;

    }






    
}
