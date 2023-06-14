package etc;

public class Factorial2 {


    public static void main(String[] args) {
        // factorial(5);

        System.out.println(factorial(5));


    }

    static int factorial(int n){
        if(n < 1) return 0;

        if(n == 1) return 1;

        return n * factorial(n-1);
    }

    
}
