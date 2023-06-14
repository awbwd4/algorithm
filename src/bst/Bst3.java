package bst;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bst3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //탐색될 배열의 길이
        int n = sc.nextInt();
        //탐색할 숫자의 수
        int m = sc.nextInt();

        Integer[] target = new Integer[n];

        for(int i = 0; i<n;i++){
            target[i] = sc.nextInt();
        }

        //소팅, 오름차순
        Arrays.sort(target);
        System.out.println("===============");
        //탐색할 숫자만큼 만복
        for(int i = 0; i< m; i++){
            int value = sc.nextInt();

            int startIndex = 0;
            int endIndex = m-1;
            boolean find = false;
            //배열 반복
            while(startIndex <= endIndex){
                int mid = (startIndex+endIndex)/2;
                if(value < target[mid]){
                    endIndex = mid-1;
                }else if(value > target[mid]){
                    startIndex = mid+1;
                }else{
                    find = true;
                    break;
                }
            }
            

            if(!find) System.out.println("-1");
            else System.out.println("1");

        }


    }
}
