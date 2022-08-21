import java.util.Scanner;

public class Recur_hello {
//    Print hello n times
    public static void print(int n){
        if (n==0)
            return;
        print(n-1);
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        print(num);
    }
}
