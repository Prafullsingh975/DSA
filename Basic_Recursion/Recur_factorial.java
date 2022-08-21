import java.util.Scanner;

public class Recur_factorial {
//    Factorial
    public static int fact(int n){
        if (n==0||n==1)
            return 1;
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = fact(num);
        System.out.println("Factorial of " + num + " = "+fact);
    }
}
