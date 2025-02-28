package myProject;

import java.util.Scanner;

public class Methods {
    static int add(int a,int b){
        return a+b;
    }
    static int subtract(int a , int b){
        return a - b;
    }
    static int multiply(int a , int b){
        return a*b;
    }
    static float divide(int a , int b){
        return (a/b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number");
        int a = sc.nextInt();
        System.out.print("enter second number");
        int b = sc.nextInt();
        int add = add(a,b);
        System.out.printf("the sum of %d and %d = %d\n",a,b,add);
        int subtract = subtract(a, b);
        System.out.printf("the difference of %d and %d = %d\n",a,b,subtract);
        int multiply = multiply(a, b);
        System.out.printf("the product of %d and %d = %d\n",a,b,multiply);
        float divide = divide(a, b);
        System.out.printf("the division of %d and %d = %f\n",a,b,divide);
        sc.close();
    }
}
