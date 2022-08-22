import java.util.Scanner;

public class Automorphic_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int sqr = (int)Math.pow(num,2);
        int count = (int)Math.log10(num)+1;
        System.out.println(sqr%(int)Math.pow(10,count)==num?num+" is an automorphic number":num+" is not an automorphic number");
    }
}
