package DSA;
import java.util.Scanner;

public class SumOfSum{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // System.out.print("enter a number n : ");
        // int n = sc.nextInt();
        // System.out.print("enter a number k : ");
        // int k = sc.nextInt();
        // for (int i = 0; i < k; i++) {
        //     n = n*(n+1)/2;
        // }
        // System.out.println(n);

        // summ of n natural

        System.out.print("enter a number n : ");
        int n = sc.nextInt();
        int sum=0;
       for (int i = 1; i <= n; i++) {
           sum = sum +  i*(i+1)/2;
       }
       System.out.println(sum);
       sc.close();

    }
}