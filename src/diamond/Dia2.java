package diamond;

public class Dia2 {

    /*
     *0     *
     *1    ***  
     *2   *****
     *3  *******
     *4 *********
     *5  *******
     *6   *****
     *7    ***
     *8     *
     * 
     */

    public static void main(String[] args) {
        
        int n = 9;


        for (int j = 0; j < n/2+1; j++) {
            
            for (int i = 0; i < (n/2)+1-j; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < (2*j)+1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int j = 0; j < n/2;j++){
            for (int i = 0; i < j+2; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < n-2*(1+j); i++) { // 
                System.out.print("*");
            }
            System.out.println();



        }        






    }









    
}
