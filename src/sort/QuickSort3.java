package sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort3 {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);

        List<Integer> result=  quickSort(list);

        for(int num:result){
            System.out.print(num + " ");
        }
    }

    private static List<Integer> quickSort(List<Integer> list) {
        //길이가 1이면 리턴
        if(list.size() <= 1) return list;
        
        //피봇 지정
        int pivot = list.get(list.size()/2);

        //분배할 리스트 선언
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();


        //분배
        for(int i = 0;i<list.size();i++){
            if(list.get(i)<pivot){
                left.add(list.get(i));
            }else if(list.get(i)>pivot){
                right.add(list.get(i));
            }else{
                equal.add(pivot);
            }
        }

        //재귀
        List<Integer> sortedLeft = quickSort(left);
        List<Integer> sortedRight = quickSort(right);


        //합치기
        List<Integer> sorted = new ArrayList<>(sortedLeft);
        sorted.addAll(equal);
        sorted.addAll(sortedRight);

        return sorted;
    }




}
