package bst;

import java.util.Arrays;
import java.util.Scanner;

public class Bst {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 배열의 길이
        int n = sc.nextInt();
        // 정렬할 배열
        int[] target = new int[n];

        for(int i=0; i < n; i++){
            target[i] = sc.nextInt();
        }
        

        //탐색할 숫자의 수
        int m = sc.nextInt();

        //오름차순 소팅을 먼저해야한다 반드시!!!!!
        Arrays.sort(target);

        for(int i = 0; i <m;i++){
            //탐색할 숫자
            int value = sc.nextInt();

            boolean find = false;
            int start = 0;
            int end = target.length-1;//4
            while(start <= end){
                int mid = (start+end)/2; //3
                
                if(target[mid] > value){
                    end = mid-1;
                }else if(target[mid] < value){
                    start = mid+1;
                }else{
                    find = true;
                    break;
                }
            }

            if(find){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }

}
