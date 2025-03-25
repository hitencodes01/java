package DSA;
import java.util.Scanner;
public class LastDigitNumber {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in);){
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int lastDigit = n % 10;
       System.out.println("last digit is = " + lastDigit);
       }
    }
}
