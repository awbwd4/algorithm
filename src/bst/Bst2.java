package bst;

import java.util.Arrays;
import java.util.Scanner;

public class Bst2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //배열의 길이
        // int n = sc.nextInt();
        int n = 10;
        System.out.println("배열의 길이 : "+n);

        // int[] target = new int[n];
        int[] target = {10, 4,1, 9, 12, 13, 20, 5,25};

        // for (int i = 0; i < target.length; i++) {
        //     target[i] = sc.nextInt();
        // }

        //탐색할 숫자의 수
        int m = sc.nextInt();
        

        //소팅 먼저 해줘야함.
        Arrays.sort(target);


        // 탐색할 숫자만큼 반복
        for (int i = 0; i < m; i++) {
            //탐색할 숫자.
            int value = sc.nextInt();

            boolean find = false;// 찾았는지 여부

            int start = 0;
            int end = target.length-1; // 첫 시작은 전부 다 검색이지만 갈수록 좁아진다.

            while(start <= end){
                int mid = (start+end)/2;
                // 이진탐색은 항상 검색 대상 리스트의 가운뎃값 기준으로 
                // 찾을 값이 가운뎃값 보다 큰지 작은지를 생각한다.
                // 업다운 같은거라 생각하면 됨.
                if(value < target[mid]){
                    //찾을 값 < 중간값
                    end = mid-1;
                }else if(value > target[mid]){
                    // 찾을값 > 중간값
                    start = mid+1;
                }else {
                    //찾을값 = 중간값
                    //값을 찾은 것이므로 종료.
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
