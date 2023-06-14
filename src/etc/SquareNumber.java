package etc;

import javax.sound.midi.Soundbank;

public class SquareNumber {

    public static void main(String[] args) {


        System.out.println(soulution(143));
        
    }

    static boolean soulution(int number){

        double rooted = Math.sqrt(number);

        if(rooted % 1 == 0){
            return true;
        }else{
            return false;
        }

    }



}
