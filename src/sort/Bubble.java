package sort;

public class Bubble {

    public static void main(String[] args) {
        int[] target = {5,2,3,4,1};
        

        for (int i = 0; i < target.length-1; i++) {
            boolean swap = false;
            for (int j = 0; j < target.length-1-i; j++) {
                if (target[j] > target[j+1]){
                    int temp = target[j];
                    target[j] = target[j+1];
                    target[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
        
        for (int j = 0; j < target.length; j++) {
            System.out.print(target[j]+" ");
            
        }



    }








    
}
