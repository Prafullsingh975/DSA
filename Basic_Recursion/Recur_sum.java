import java.util.Scanner;

public class Recur_sum {
//    Sum of first n natural numbers
    public static int sum(int n){
        if (n==1)
            return 1;
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sum(n);
        System.out.println("Sum = "+sum);
    }
}
