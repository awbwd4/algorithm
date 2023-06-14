package sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort4 {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);


        List<Integer> result = quick(list);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        }


    }

    static List<Integer> quick(List<Integer> list){
        
        //길이가 1이면 리턴
        if(list.size()<=1) return list;

        //피봇 지정
        int pivot = list.get(list.size()/2);

        //분배될 리스트 선언
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<pivot){
                left.add(list.get(i));
            }else if(list.get(i)>pivot){
                right.add(list.get(i));
            }else{
                equal.add(pivot);
            }
        }

        //분배된 리스트들에 대해서 재귀적으로 다시 정렬
        List<Integer> sortedLeft = quick(left);
        List<Integer> sortedRight = quick(right);

        //합치기
        List<Integer> result = new ArrayList<>(sortedLeft);
        result.addAll(equal);
        result.addAll(sortedRight);

        return result;

    }




}
