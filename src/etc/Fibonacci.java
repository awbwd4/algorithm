package etc;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //리스트의 길이 n
        int n = sc.nextInt();
        int[] fiboList = new int[n];
        for (int i = 0; i < fiboList.length; i++) {
            fiboList[i] = fibonacci(i);
        }
        for (int i = 0; i < fiboList.length; i++) {
            System.out.print(fiboList[i] + " ");
        }
        
    }

    static int fibonacci(int i){
        int result = 0;

        if(i == 0){
            result = 1;
        }else if(i == 1){
            result = 1;
        }else if(i >=2){
            result = fibonacci(i-2)+fibonacci(i-1);
        }

        return result;
    }
}
