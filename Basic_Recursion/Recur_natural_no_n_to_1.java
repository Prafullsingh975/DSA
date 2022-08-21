import java.util.Scanner;

public class Recur_natural_no_n_to_1 {
    //    Print natural numbers n to 1
    public static void naturalNumber(int n){
        if (n==0)
            return;
        System.out.print(n+" ");
        naturalNumber(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        naturalNumber(n);
    }
}
