package question;

import java.util.Scanner;

public class SumOfEvenFourthPower {
    public int evenFourth(int x){
        int sum = 0;
        for (int i = 1; i <= x ; i++) {
            if(i%2==0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter term : ");
        int n = sc.nextInt();
        sc.close();
    }
}
