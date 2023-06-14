package bst;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Bst5 {
    
    public static void main(String[] args) {
        
    }


    

    static void solution(){
        
        Scanner sc = new Scanner(System.in);
        
        //탐색 대상 리스트의 길이
        int m = sc.nextInt();
        int[] target = new int[m];

        //탐색 대상 리스트 초기화
        for (int i = 0; i < m; i++) {
            target[i] = sc.nextInt();
        }

        // 탐색할 밸류값의 수
        int n = sc.nextInt();

        //오름차순 소팅
        Arrays.sort(target);


        for(int i = 0; i<m;i++){ //탐색할 숫자만큼 반복
            
            int value = sc.nextInt();//탐색할 숫자

            boolean find = false; //해당 숫자를 찾았는지

            int startIndex = 0;
            int endIndex = target.length-1;

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

            if(find) System.out.println("1");
            else System.out.println("0");


        }





    }




}
