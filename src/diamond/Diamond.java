package diamond;

import java.util.Scanner;

public class Diamond {
    
/*    *    
 *   *** 
 *  ***** 
 * ******* 
 ********** 
 * *******
 *  *****
 *   ***
 *    * 
 * 
 * 
 * 
 * 
*/


public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // 대각선의 길이, 높이
    // int n = sc.nextInt();

    int n = 9;

    //0~4 : 9
    // 0

    for(int j = 0; j<n/2+1; j++){
        // 0
        for(int i = 0; i < (n/2)+1-j ; i++){
            System.out.print(" ");
        }
        
        for(int i = 0; i < 2*j+1; i++){
            System.out.print("*");
        }
        System.out.println();
        
    }

    // 0~3 : 4
    for(int j = 0; j< n/2; j++){
        //0
        for (int i = 0; i < j+2; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 2*(n/2-j)-1; i++) { // 2*(9/2) -2i 2(n/2-i)
            System.out.print("*");
        }
        System.out.println();

    }
}

}
