import java.util.Scanner;

public class Pallindromic_numbers {
//    Second approach
    /*
    int to String to String builder then use reverse
    After that come back to string then come back to int
     */
    public static int strReverse(int s){
        String num = String.valueOf(s);
        int rev =0;
        return rev;
    }
    public static int reverse(int n){
        int rev = 0;
        while (n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int rev = reverse(num);
        System.out.println(rev==num?num+" is a pallindromic Number":num+" is not a pallindromic Number");

    }
}
