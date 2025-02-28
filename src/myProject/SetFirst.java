package myProject;
import java.util.Scanner;
public class SetFirst {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // to add two numbers
        System.out.print("enter the first number : ");
        int a = sc.nextInt();
        System.out.print("enter the second number : ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.printf("The sum of %d and %d = : %d",a,b,c);

        // mostly occured operators
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a+b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        sc.close();
    }
}
