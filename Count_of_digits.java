import java.util.Scanner;

public class Count_of_digits {
    public static int cod(int n){
        int count = (int)Math.log10(n)+1;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int count = cod(num);
        System.out.println("Number of digits in "+num+" are "+count);
    }
}
