import java.util.Scanner;

public class LCM {
    static int gcd(int a, int b){
        while (a!=0){
            int gcd = b%a;
            b = a;
            a = gcd;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = gcd(num1,num2);
        int lcm = (num1*num2)/gcd;
        System.out.println("LCM("+num1+","+num2+") = "+lcm);
    }
}
