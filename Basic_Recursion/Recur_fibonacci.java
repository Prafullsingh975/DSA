import java.util.Scanner;

public class Recur_fibonacci {
    public static int fibo(int n){
        if (n<=1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position to get Fibonacci number from series: ");
        int position = sc.nextInt();
        System.out.println("Fibonacci number at "+ position + " position -> "+fibo(position));
    }
}
