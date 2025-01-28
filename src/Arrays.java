
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i =0 ; i < arr.length ; i++){
            System.out.print("enter number : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[1]);
    }
    
}