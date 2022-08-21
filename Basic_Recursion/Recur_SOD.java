import java.util.Scanner;

public class Recur_SOD {
//    SOD (Sum Of Digits)
    public static int sod(int n){
        int sum = 0;
        if (n==0)
            return sum;

    return (n%10)+sod(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sod = sod(num);
        System.out.println("Sum of digits of "+num+" = " +sod);
    }
}
