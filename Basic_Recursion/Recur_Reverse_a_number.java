import java.util.Scanner;

public class Recur_Reverse_a_number {
//    Reverse a number
    public static int revNumber(int n,int reverse){
//        int rev;
        if(n==0)
            return reverse;
        reverse = (n%10)+reverse*10;
        return  revNumber(n/10,reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        Set second value of function (i.e reverse =0)
        int rev = revNumber(num,0);
        System.out.println("Reverse of "+ num + " is "+rev);
    }
}
