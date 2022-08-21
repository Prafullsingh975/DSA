import java.util.Scanner;

public class Recur_GCD_HCF {
    public static int gcd(int a,int b){
        if (a==0)
            return b;
        return gcd(b%a,a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("GCD or HCF of "+num1+" and "+num2+" = "+gcd(num1,num2));
    }
}
