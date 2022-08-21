import java.util.Scanner;

public class Recur_natural_no_1_to_n {
//    Print natural numbers 1-n
    public static void naturalNumber(int n){
        if (n==0)
            return;
        naturalNumber(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        naturalNumber(n);
    }
}
