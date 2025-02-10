import java.util.Scanner;
public class Recurssion {
    static int factorial(int n){
        if (n==1 || n==0){
            return 1;
        }
        else{
            System.out.println(n);
            int fact = n * factorial(n-1);
            System.out.println("fact = "+fact);
            return fact;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to find its factorial : ");
        int term = sc.nextInt();
        System.out.printf("the factorial of %d is %d",term , factorial(term));
    }
}