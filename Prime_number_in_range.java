import java.util.Arrays;
import java.util.Scanner;

public class Prime_number_in_range {
//    First approach [SLOW]
    public static void primeNumRange(boolean[]range){
        range[0]=false;
        range[1]=false;
//        range[range.length-1]=false;
        for (int i = 2; i < Math.sqrt(range.length) ; i++) {
            for (int j = i+1; j < range.length ; j++) {
                if (j%i==0)
                    range[j]=false;
            }
        }
        for (int i = 2; i < range.length; i++) {
            System.out.println(range[i]?i+" ":"");
        }
    }
//    Second approach [FASTEST Algo (Sieve Of Eratosthenes)]
    public static boolean[] sieveOfEratosthenes(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for (int i = 2; i <Math.sqrt(isPrime.length) ; i++) {
            for (int j = 2*i; j < isPrime.length; j+=i) {
                isPrime[j]=false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one number as range: ");
        int num = sc.nextInt();
        boolean arr[] = new boolean[num+1];
        Arrays.fill(arr,true);
//        primeNumRange(arr);  //SLOW
        boolean[] isPrime = sieveOfEratosthenes(num); //FASTEST Algo
        for (int i = 2; i < isPrime.length ; i++) {
            System.out.print(isPrime[i]?i+" ":"");
        }
    }
}
