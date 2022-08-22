import java.util.Scanner;

public class Prime_number {
    public static boolean isPrime(int n){
        if (n<=1)
            return false;
        if (n==2)
            return true;
        if (n%2==0)
            return false;
        for (int i = 3; i <Math.sqrt(n) ; i=i+2) {
            if (n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int num = sc.nextInt();
        boolean isPrime=isPrime(num);
        System.out.println(isPrime?num+" is a prime number":num+" is not a prime number");
    }
}
