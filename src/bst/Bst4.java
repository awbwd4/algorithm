package bst;

import java.util.Scanner;
import java.util.Arrays;

public class Bst4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        //탐색될 배열의 길이
        int n = sc.nextInt();    
        //탐색할 숫자의 수
        int m = sc.nextInt();
    
        //타겟 리스트
        Integer[] target = new Integer[n];
    
        for(int i = 0; i<n ;i++){
            target[i] = sc.nextInt();
        }
        //리스트 오름차순
        Arrays.sort(target);

        System.out.println("=========================");

        solution(target, m);

    }


    static void solution(Integer[] target, int valueCount){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < valueCount; i++){
            
            int value = sc.nextInt();

            boolean find = false; // value를 찾았는지 여부

            int startIndex = 0;
            int endIndex = target.length-1;


            while(startIndex <= endIndex){
                int mid = (startIndex+endIndex)/2;
                //이진 탐색은 항상 검색 대상 리스트의 가운뎃 값 기준으로 업다운함.
                if(value < target[mid]){
                    endIndex = mid-1;
                }else if(value > target[mid]){
                    startIndex = mid+1;
                }else{
                    find = true;
                    break;
                }
            }

            if(find)System.out.println("1");
            else System.out.println("0");

        }


    }


}
