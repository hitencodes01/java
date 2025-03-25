package DSA;

import java.util.Scanner;

public class Pr {
    public int fourthPower(int x){
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += (int) Math.pow(i, 4);
        }
        return sum;
    }
    public double fourthPowerMean(int x){
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += (int) Math.pow(i, 4);
        }
        double mean =sum/(double)x;
        return mean;
    }
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in);){
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        Pr p = new Pr();
        System.out.println("output " + p.fourthPower(n));
        System.out.printf("output %.4f%n", p.fourthPowerMean(n));
       }
    }
}
