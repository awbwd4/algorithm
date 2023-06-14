package sort;

public class Bubble2 {

    public static void main(String[] args) {
        
        int[] target = {5,4,2,3,1};


        for(int i = 0; i < target.length-1;i++){
            boolean swap = false;
            for(int j = 0; j<target.length-1-i;j++){
                if(target[j] > target[j+1]){
                    int temp = target[j];
                    target[j] = target[j+1];
                    target[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }

        for (int i = 0; i < target.length; i++) {
            System.out.print(target[i]);
        }

    }


}
