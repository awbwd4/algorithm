package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // 정렬될 배열 크기

        int n = sc.nextInt();

        List<Integer> target = new ArrayList();
        
        for(int i = 0; i<n;i++){
            int element = sc.nextInt();
            target.add(element);
        }

       System.out.println(quickSort(target));



        sc.close();
    }


    public static List<Integer> quickSort(List<Integer> target){
        
        //탈출조건
        if(target.size() <= 1){
            return target;
        }

        //pivot 지정
        int pivot = target.get(0);
        
        //left, right
        List<Integer> left = new ArrayList();
        List<Integer> equal = new ArrayList();
        List<Integer> right = new ArrayList();


        //left로 보낼지 right로 보낼지 판정
        for(int i = 1; i < target.size(); i++){
            if(target.get(i) < pivot){
                left.add(target.get(i));
            }else if (target.get(i)>pivot){
                right.add(target.get(i));
            }else{
                equal.add(pivot);
            }
        }

        //left와 right에 대해서 재귀
        List<Integer> sortedLeft = quickSort(left);
        List<Integer> sortedRight = quickSort(right);

        //결괏값 합치기
        List<Integer> sortedTarget = new ArrayList<>(sortedLeft);
        sortedTarget.addAll(equal);
        sortedTarget.addAll(sortedRight);

        return sortedTarget;
    }



}