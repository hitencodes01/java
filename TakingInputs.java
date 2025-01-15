import java.util.Scanner;
// we need to import Scanner class for taking inputs from keyboard

public class TakingInputs {
    public static void main(String[] args) {
        // here we need to create an instance of Scanner class for using its methods like nextInt(),nextFloat() etc.
        try (Scanner sc = new Scanner(System.in)){
        // here System.in specifies that the inputs which were taking by the instance are  from the keyboard.
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println(c);
        }
    }
    
}