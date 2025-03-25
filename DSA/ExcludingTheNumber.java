package DSA;

import java.util.Scanner;
// https://www.geeksforgeeks.org/sum-of-first-n-natural-numbers-which-are-not-powers-of-k/?ref=ml_lbp
public class ExcludingTheNumber {
    public int  excludingPowerOfK(int n , int k){
        int sum = 0;
        for(int i = 1 ; i<= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if((int)Math.pow(k, i) != j){
                sum += i;
            }
        }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        System.out.print("enter a number to get excluded : ");
        int k = sc.nextInt();
        ExcludingTheNumber en = new ExcludingTheNumber();
        System.out.println(en.excludingPowerOfK(n, k));
        sc.close();
    }
}
