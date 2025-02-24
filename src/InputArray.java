
import java.util.Scanner;

public class InputArray {
    Scanner sc = new Scanner(System.in);
    public int [] getInput(int x){
        int [] arr = new int[x];
        for (int i = 0; i < x ; i++) {
            System.out.print("enter the value : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
     public static void main(String[] args){

    }
}
