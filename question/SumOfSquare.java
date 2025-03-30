package question;

import java.util.Scanner;

public class SumOfSquare {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in);)
        {
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            sum = sum + (int) Math.pow(i, 2.0);
        }
        System.out.println(sum);
    }
    }
}
